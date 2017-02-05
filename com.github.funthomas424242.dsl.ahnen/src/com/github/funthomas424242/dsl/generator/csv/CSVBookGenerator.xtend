package com.github.funthomas424242.dsl.generator.csv

import com.github.funthomas424242.dsl.ahnen.Adresse
import com.github.funthomas424242.dsl.ahnen.Familie
import com.github.funthomas424242.dsl.ahnen.FamilienImport
import com.github.funthomas424242.dsl.ahnen.Familienbuch
import com.github.funthomas424242.dsl.ahnen.Geschlecht
import com.github.funthomas424242.dsl.ahnen.Kinder
import com.github.funthomas424242.dsl.ahnen.Person
import org.eclipse.xtext.generator.IFileSystemAccess

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CSVBookGenerator {

    def static CharSequence createBookExport(IFileSystemAccess fsa, Familienbuch buch) '''
        «createTitelspalten(fsa,buch)»
        «createBookContent(fsa,buch)»         
    '''

    def static CharSequence createTitelspalten(IFileSystemAccess fsa, Familienbuch buch) '''
"Beziehungsart";"Beziehung";"Rolle";"Person";"Geschlecht";"Geburtsname";"Name";"Vorname";"Geburt";"Geburtsort";"Tod";"Sterbeort";"Vater";"Mutter";        
        
    '''

    def static String createBookContent(IFileSystemAccess fsa, Familienbuch buch) {

        var String textZeilen = "";
        for (FamilienImport familienImport : buch.familien) {
            val Familie familie = familienImport.familie;
            textZeilen += createTabellenzeile(familie,"Vater",familie.vater);
            textZeilen += createTabellenzeile(familie,"Mutter",familie.mutter);
            var Kinder kinder = familie.kinder;
            while (kinder != null) {
                val Person kind = kinder.kind;
                textZeilen+=createTabellenzeile(familie,"Kind",kind);
                kinder = kinder.next;
            }
        }

        return textZeilen;
    }

    def static String createTabellenzeile(Familie familie, String role,Person person) {
        if( familie == null || person == null){
            return "";
        }
        
        var String textZeile = "";
        textZeile += "\"" + convertStringValue(familie.rel.literal) + "\";";
        textZeile += "\"" + convertStringValue(familie.name) + "\";";
        textZeile += "\""+role+"\";";
        textZeile += "\"" + convertStringValue(person.name) + "\";";
        textZeile += "\"" + convertGeschlechtValue(person.geschlecht) + "\";";
        textZeile += "\"" + convertStringValue(person.geburtsname) + "\";";
        textZeile += "\"" + convertStringValue(person.nachname) + "\";";
        textZeile += "\"" + convertStringValue(person.vorname) +" "+ convertStringValue(person.mittelname) +  "\";";
        textZeile += "\"" + convertStringValue(person.geburtsDatum) + "\";";
        textZeile += "\"" + convertAdressValue(person.geburtsAdresse) + "\";";
        textZeile += "\"" + convertStringValue(person.todesDatum) + "\";";
        textZeile += "\"" + convertAdressValue(person.sterbeAdresse) + "\";";
        textZeile += "\"" + convertPersonValue(person.vater) + "\";";
        textZeile += "\"" + convertPersonValue(person.mutter) + "\";";
        textZeile += "\n";
        
        return textZeile;
    }
    
    def static String convertStringValue( String value ){
        if( value == null || value.equals("")){
            return "";
        }
        return value;
    }
    
    def static String convertGeschlechtValue( Geschlecht geschlecht ){
        if( geschlecht == null){
            return "";
        }
        return convertStringValue(geschlecht.literal);
    }

    def static String convertPersonValue( Person person ){
        if( person == null || person.equals("")){
            return "";
        }
        var Familie familie=person.eContainer as Familie;
        val String familienName = convertStringValue(familie.name);
        val String personName =  convertStringValue(person.name);
        return familienName + "."+personName;
    }
    

    def static String convertAdressValue( Adresse adresse ){
        if( adresse == null || adresse.equals("")){
            return "";
        }
        
        return convertStringValue(adresse.ort);
    }


}
