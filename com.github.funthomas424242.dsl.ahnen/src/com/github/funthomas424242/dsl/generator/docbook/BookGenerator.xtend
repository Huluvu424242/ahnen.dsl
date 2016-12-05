package com.github.funthomas424242.dsl.generator.docbook

import com.github.funthomas424242.dsl.ahnen.Autor
import com.github.funthomas424242.dsl.ahnen.Familienbuch
import org.eclipse.xtext.generator.IFileSystemAccess

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class BookGenerator {

	def static CharSequence createBookContent(IFileSystemAccess fsa, Familienbuch buch)	'''
<?xml version="1.0" encoding="UTF-8"?>
	«createXmlHeader()»
		
		<info>
		    <title>«buch.titel»</title>
		
			<authorgroup>
				«val autor = buch.autor as Autor»
				<author>
				<personname>
				 	  <firstname>«autor.vorname»</firstname>
				 	  <surname>«autor.nachname»</surname>
				</personname>
				«IF autor.organisationsName!=null »
					<affiliation>
						<org>
							   	<orgname>«autor.organisationsName»</orgname>
						</org>
					</affiliation>
				«ENDIF»
				</author>	
			</authorgroup>
		
«««			<pubdate>«buch.datumPublished»</pubdate>
«««			«IF buch.lizenz!=null»
«««				<legalnotice><para>«buch.lizenz.hinweis»</para></legalnotice>
«««			«ENDIF» 	
		</info>
		«IF buch.vorwort != null»
			«createVorwort(buch)»	
		«ENDIF»
		
		<toc/>
		
		«FOR curFamilie : buch.familien»			
			«val familienIndex = buch.familien.indexOf(curFamilie)»
			«FamilienGenerator.createPart(fsa,buch,curFamilie.familie,familienIndex)»
		«ENDFOR»
	</book>
	'''
	
	def static createXmlHeader() '''
	<book version="5.0"
		  lang="de" 
		     xmlns="http://docbook.org/ns/docbook"
		     xmlns:xlink="http://www.w3.org/1999/xlink"
		     xmlns:xi="http://www.w3.org/2001/XInclude">	

	'''
	
	def static createVorwort(Familienbuch buch) '''
		<preface>
			<title>Vorwort</title>
		
		    <para>«buch.vorwort»</para>
		
«««				«IF buch.absatz != null»
«««					«FOR absatz : buch.absatz»
«««						«IF absatz.titel != null»
«««							<para>«absatz.text»</para>
«««						«ELSE»
«««							<formalpara><title>«absatz.titel»</title>
«««							<para>«absatz.text»</para>
«««							</formalpara>
«««						«ENDIF»
«««					«ENDFOR»			
«««				«ENDIF»
		</preface>
	'''

}
