package com.github.funthomas424242.dsl.generator.database

import com.github.funthomas424242.dsl.ahnen.Familienbuch
import com.github.funthomas424242.dsl.generator.Helper

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class HeaderGenerator{
	
	def static String createHeader(Familienbuch buch) {
	    return createHeaderContent(buch);
	}
	
	def static String createHeaderContent(Familienbuch buch) '''
  <header>
    <created date="«Helper.getGrampsStandardDate()»" version="«buch.version»"/>
    <researcher>
      <resname>«buch.autor.vorname+" "+buch.autor.nachname»</resname>
    </researcher>
    <mediapath>{GRAMPS_RESOURCES}/«buch.mediaFolder»</mediapath>
  </header>
 '''
}
