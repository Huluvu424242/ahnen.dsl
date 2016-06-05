package com.github.funthomas424242.dsl.generator

import com.github.funthomas424242.dsl.ahnen.Familie
import com.github.funthomas424242.dsl.ahnen.Familienbuch
import com.github.funthomas424242.dsl.ahnen.Person
import org.eclipse.xtext.generator.IFileSystemAccess

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class FamilienGenerator {

	def static createPart(IFileSystemAccess fsa, Familienbuch buch, Familie familie, int parentIndex) 
'''		
		<part>
		    <title>«familie.name»</title>
		    
«««		    <partintro>
«««		    «IF familie.zitat != null»
«««		    <blockquote>
«««		    	<attribution>«familie.zitat.verfasser»</attribution>
«««		    	<para>
«««		    		«familie.zitat.text»
«««		    	</para>
«««		    </blockquote>
«««		    «ENDIF»
«««		    «IF familie.bild != null»
«««		    <graphic 
«««		    	srccredit="«familie.bild.beschreibung»" 
«««		    	fileref="«Helper.getFileRef(familie.bild)»"/>
«««		    «ENDIF»
«««		    «IF familie.zusammenfassung != null»
«««		    <para>
«««		    	«familie.zusammenfassung.text»
«««		    </para>
«««		    «ENDIF»
«««		    
«««		    </partintro>
		    
		    «FOR person : familie.personen»
		    	«val personIndex = familie.personen.indexOf(person)»
			<xi:include href="Person_«parentIndex+'_'+personIndex».dbk" />
			«fsa.generateFile(Helper.getDbkFileName(buch, "Person_"+parentIndex+'_'+personIndex+".dbk"),
			createChapter(fsa,buch,person, parentIndex+" "+personIndex))»
			«ENDFOR»
		</part>
	'''

	def static createChapter(IFileSystemAccess fsa, Familienbuch buch, Person person, String rezeptIndex) '''
<?xml version="1.0" encoding="UTF-8"?>
<chapter version="5.0" xmlns="http://docbook.org/ns/docbook"
         xmlns:xlink="http://www.w3.org/1999/xlink"
         xmlns:xi="http://www.w3.org/2001/XInclude"
         xmlns:ns5="http://www.w3.org/2000/svg"
         xmlns:ns4="http://www.w3.org/1998/Math/MathML"
         xmlns:ns3="http://www.w3.org/1999/xhtml"
         xmlns:db="http://docbook.org/ns/docbook">
 
 <chapterinfo>
 	<pubdate>«person.letzteAenderung» </pubdate>
 </chapterinfo>
 
<title>«person.vorname+person.mittelname+person.nachname»</title>
«IF person.rufname != null»
	<subtitle>«"*"+person.geburtsDatum+" +"+person.todesDatum»</subtitle>
«ENDIF»

<formalpara>
	<title>Personendetails</title>

    <para>
    
	   <variablelist>
	   
	   <varlistentry><term>Vorname</term>
	   <listitem>
	   <para>
	   «person.vorname»
	   </para>
	   </listitem>
	   </varlistentry>
	   
	   <varlistentry><term>Name</term>
   	   <listitem>
   	   <para>
   	   «person.name»
   	   </para>
   	   </listitem>
   	   </varlistentry>
	   
	   <varlistentry><term>Mittelname</term>
   	   <listitem>
   	   <para>
   	   «person.mittelname»
   	   </para>
   	   </listitem>
   	   </varlistentry>
	   
	   <varlistentry><term>geboren am</term>
   	   <listitem>
   	   <para>
   	   «person.geburtsDatum»
   	   </para>
   	   </listitem>
   	   </varlistentry>
	   
	   <varlistentry><term>gestorben am</term>
   	   <listitem>
   	   <para>
   	   «person.todesDatum»
   	   </para>
   	   </listitem>
   	   </varlistentry>
	   
	   </variablelist>

    
    
    </para>  
</formalpara>
«««//
«««//<para>
«««//	<variablelist>
«««//	     <varlistentry>
«««//	       <term>Tags:</term>
«««//		<listitem>
«««//		   	<para>
«««//		   	«FOR tag : familie.tags»
«««//		«IF familie.tags.indexOf(tag)>0»,«ENDIF»
«««//		«IF tag instanceof BenutzerTag»
«««//			«tag.bezeichnung»
«««//		«ENDIF»
«««//		«IF tag instanceof StoffTag»
«««//			«tag.stoff»
«««//		«ENDIF»
«««//		«IF tag instanceof DiaetTag»
«««//			«tag.diaet»
«««//		«ENDIF»
«««//	«ENDFOR»
«««//	</para>
«««//	</listitem>
«««//	    </varlistentry>
«««//	 <varlistentry>
«««//	   <term>Quelle:</term>
«««//	<listitem><para>
«««//			«IF familie.quelle==null»
«««//				nicht angegeben
«««//			«ELSE»
«««//				«IF familie.quelle instanceof Literaturquelle»
«««//					«val literaturQuelle = familie.quelle as Literaturquelle»
«««//					«literaturQuelle.modifikation» übernommen aus: «literaturQuelle.beschreibung»
«««//				«ENDIF»
«««//				«IF familie.quelle instanceof Personenquelle»
«««//					«val personenQuelle = familie.quelle as Personenquelle»
«««//					überliefert von «personenQuelle.personenBeschreibung»
«««//				«ENDIF»
«««//			«ENDIF»
«««//		</para></listitem>
«««//		 </varlistentry>
«««//		  </variablelist>
«««//</para>
«««//
«««//<formalpara>
«««//	<title>Zutaten</title>
«««//
«««//    <para><itemizedlist>
«««//    «FOR zutat : familie.zutaten»
«««//	<listitem>
«««//	    <para>
«««//«IF zutat.menge instanceof BestimmteMenge» 
«««//	«val menge = zutat.menge as BestimmteMenge»
«««//		«Helper.stripQuotes(menge.betrag)»
«««//		«menge.details»
«««//		«IF menge.einheit != Masseinheit.KEINEAUSWAHL && menge.einheit != Masseinheit.STUECK»
«««//			«menge.einheit»
«««//		«ENDIF»
«««//«ENDIF»
«««//«zutat.name»
«««//«IF zutat.menge instanceof UnbestimmteMenge»
«««//	«val menge = zutat.menge as UnbestimmteMenge»	
«««//	«IF menge.menge != UnbestimmteMengenangabe.KEINEAUSWAHL»          		
«««//		«menge.menge»
«««//	«ENDIF»
«««//«ENDIF»
«««//	</para>
«««//	    </listitem>
«««//«ENDFOR»  
«««//    </itemizedlist></para>
«««//  </formalpara>
«««//
«««//  <formalpara>
«««//    <title>Arbeitsschritte</title>
«««//
«««//    <para><orderedlist>
«««//    «FOR schritt : familie.schritte»  
«««//<listitem>
«««//   	<para>
«««//«schritt.beschreibung»
«««// </para>
«««// «IF schritt.notiz != null»
«««// 	<note>
«««// 	 <para>
«««// 	«schritt.notiz.text»
«««// 	 </para>
«««// 	</note>
«««// «ENDIF»
«««// </listitem>
«««//«ENDFOR»
«««//</orderedlist ></para>
«««//«IF !familie.notizen.nullOrEmpty»
«««//	<formalpara>
«««//	     <title>Hinweise</title>
«««//	<para>
«««//	«FOR notiz : familie.notizen»
«««//		<note>
«««//			<para>«notiz.text»</para>
«««//		</note>
«««//	«ENDFOR»
«««//	</para>
«««//	</formalpara>
«««//«ENDIF»
«««//	</formalpara>
«««//
«««//  <formalpara>
«««//    <title>Einkaufsempfehlung</title>
«««//	«IF familie.produkte == null»
«««//	<para>
«««//		Keine verfügbar.
«««//	</para>
«««//«ELSE»
«««//	<para><itemizedlist>
«««//	«FOR produktRef : familie.produkte»
«««//		<listitem>
«««//		        <para>
«««//		«Helper.stripQuotes(produktRef.anzahl)» x
«««//			«IF produktRef.produkt.verpackung != Verpackung.KEINEAUSWAHL»
«««//				«produktRef.produkt.verpackung»
«««//			«ENDIF»
«««//			«produktRef.produkt.name» 
«««//			«IF produktRef.produkt.menge instanceof BestimmteMenge»
«««//				«val menge = produktRef.produkt.menge»
«««//				«Helper.stripQuotes(menge.betrag)» 
«««//				«IF menge.einheit != Masseinheit.KEINEAUSWAHL»
«««//					«menge.einheit»
«««//				«ENDIF»
«««//			«ENDIF»
«««//		</para>
«««//		 </listitem>
«««//	«ENDFOR»
«««//	</itemizedlist></para>
«««//«ENDIF»
«««//	</formalpara>
«««//
«««//«IF !familie.bilder.nullOrEmpty»
«««//<formalpara>
«««//
«««//  <title>Bilder</title>
«««//
«««//	<para>
«««//	«FOR bild : familie.bilder»	
«««//		«IF bild.internetPage != null »
«««//			<ulink url="«bild.internetPage.url»">
«««//		«ELSE»
«««//			<ulink url="«Helper.getFileRef(bild)»">
«««//	 	«ENDIF»
«««//			<inlinemediaobject>		
«««//				<alt>«bild.beschreibung»</alt>	
«««//				      <imageobject>
«««//					<info>
«««//						<legalnotice><para>«bild.lizenz»</para></legalnotice>
«««//						<author>
«««//							<personname>
«««//										<othername>«bild.urheber»</othername>
«««//							</personname>
«««//						</author>
«««//							</info>
«««//					<imagedata contentwidth="2in" fileref="«Helper.getFileRef(bild)»">
«««//					</imagedata>
«««//				</imageobject>
«««//				<!-- alternative beschreibung auf rein textbasierten Systemen -->
«««//				<textobject>
«««//					<phrase>«bild.beschreibung»</phrase>
«««//				</textobject>
«««//			</inlinemediaobject>
«««//		</ulink>
«««//		<footnote>
«««//			<para>
«««//				<trademark class='copyright'/>
«««//				<author>
«««//					<personname>
«««//						<othername>«bild.urheber»</othername>
«««//					</personname>
«««//				</author>
«««//				geschützt durch: «bild.lizenz».
«««//			</para>
«««//		</footnote>
«««//	«ENDFOR»
«««//	</para>
«««//
«««//  </formalpara>
«««//«ENDIF»

</chapter>
'''

}