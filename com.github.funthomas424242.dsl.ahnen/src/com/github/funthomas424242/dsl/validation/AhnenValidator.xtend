/*
 * generated by Xtext 2.10.0
 */
package com.github.funthomas424242.dsl.validation

import com.github.funthomas424242.dsl.ahnen.AhnenPackage
import com.github.funthomas424242.dsl.ahnen.Beziehung
import com.github.funthomas424242.dsl.ahnen.Familie
import com.github.funthomas424242.dsl.ahnen.Kinder
import com.github.funthomas424242.dsl.ahnen.Person
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.validation.Check
import com.github.funthomas424242.dsl.ahnen.Beziehungsrolle

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class AhnenValidator extends AbstractAhnenValidator {

    @Check
    def void checkFamilyConsistence(Familie familie) {
        var Person vater = familie.vater;
        checkPersonBackRefToFamily(familie, vater, AhnenPackage.Literals.FAMILIE__VATER);

        var Person mutter = familie.mutter;
        checkPersonBackRefToFamily(familie, mutter, AhnenPackage.Literals.FAMILIE__MUTTER);

        var Kinder kinder = familie.kinder;
        while (kinder != null && kinder.kind != null) {
            checkPersonBackRefToFamily(familie, kinder.kind, AhnenPackage.Literals.FAMILIE__KINDER);
            kinder = kinder.next;
        }

    }

    def void checkPersonBackRefToFamily(Familie familie, Person person, EReference warningPlace) {

        if (familie == null || person == null) {
            return;
        }

        if (person.beziehungen == null || person.beziehungen.empty) {
            warning(
                "Person: " + person.name + " benötigt eine Beziehung zur Familie: " + familie.name,
                warningPlace
            );
            return;
        }
        var boolean hasBackLink = false;
        for (Beziehung beziehung : person.beziehungen) {
            if (beziehung.beziehung != null && beziehung.beziehung instanceof Familie &&
                beziehung.beziehung.name.equals(familie.name)) {
                hasBackLink = true;
            }
        }

        if (!hasBackLink) {
            if (person.beziehungen != null && !person.beziehungen.empty) {
                warning(
                    "Person: " + person.name + " benötigt eine Beziehung zu " + familie.rel + ": " + familie.name,
                    warningPlace
                );
            }
        }
    }

    @Check
    def void calcTODOs(Familie familie) {

        if (familie.vater == null) {
            info(
                "Familie: " + familie.name + " benötigt einen Vater.",
                AhnenPackage.Literals.FAMILIE__NAME
            );
        }
        if (familie.mutter == null) {
            info(
                "Familie: " + familie.name + " benötigt eine Mutter.",
                AhnenPackage.Literals.FAMILIE__NAME
            );
        }
    }

    @Check
    def void checkPersonPflichtfelder(Person person) {
        if (person.geschlecht == null) {
            error("Für Person " + person.name + " wurde kein Geschlecht ausgewählt.",
                AhnenPackage.Literals.PERSON__GESCHLECHT);
        }

        // Check Vater in Familie auf anderen Vater in Familie
        person.beziehungen.stream.filter[role.value == Beziehungsrolle.V_VALUE].forEach [
            val Beziehung beziehung = it;
            if (beziehung.beziehung != null && beziehung.beziehung instanceof Familie) {
                var hasDifference = false;
                if (beziehung.beziehung.vater == null) {
                    hasDifference = true;
                } else {
                    val Familie vaterFamilie = beziehung.beziehung.vater.eContainer as Familie;
                    val Familie personFamilie = person.eContainer as Familie;
                    if (!personFamilie.name.equals(vaterFamilie.name) ||
                        !person.name.equals(beziehung.beziehung.vater.name)) {
                        hasDifference = true;
                    }

                }
                if (hasDifference) {
                    error("Für Person " + person.name + " wurde eine Vaterbeziehung zu " + beziehung.beziehung.name +
                        " definiert, obgleich dort ein anderer Vater eingetragen ist.",
                        AhnenPackage.Literals.PERSON__BEZIEHUNGEN);

                }
            }
        ];

        // Check Mutter in Familie auf andere Mutter in Familie
        person.beziehungen.stream.filter[role.value == Beziehungsrolle.M_VALUE].forEach [
            val Beziehung beziehung = it;
            if (beziehung.beziehung != null && beziehung.beziehung instanceof Familie) {
                var hasDifference = false;
                if (beziehung.beziehung.mutter == null) {
                    hasDifference = true;
                } else {
                    val Familie mutterFamilie = beziehung.beziehung.mutter.eContainer as Familie;
                    val Familie personFamilie = person.eContainer as Familie;
                    if (!personFamilie.name.equals(mutterFamilie.name) ||
                        !person.name.equals(beziehung.beziehung.mutter.name)) {
                        hasDifference = true;
                    }

                }
                if (hasDifference) {
                    error("Für Person " + person.name + " wurde eine Mutterbeziehung zu " + beziehung.beziehung.name +
                        " definiert, obgleich dort eine andere Mutter eingetragen ist.",
                        AhnenPackage.Literals.PERSON__BEZIEHUNGEN);

                }
            }
        ];

    }

//	@Check
//	def void checkBuch(Familienbuch buch){
//	    // Alle im Buch bekannten Familien ermitteln
//	    var HashSet<String> familien = new HashSet<String>();
//	    for( FamilienImport familienImport:buch.familien){
//	        familien.add(familienImport.familie.name);
//	    }
//	    // Im Buch fehlende Familien markieren
//	    for( buch.)
//	}
}
