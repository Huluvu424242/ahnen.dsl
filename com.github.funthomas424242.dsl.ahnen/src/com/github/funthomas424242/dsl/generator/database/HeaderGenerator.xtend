package com.github.funthomas424242.dsl.generator.database

import com.github.funthomas424242.dsl.ahnen.Familienbuch

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
    <created date="2016-08-31" version="5.0.0"/>
    <researcher>
      <resname>Alex Roitman,,,</resname>
    </researcher>
    <mediapath>{GRAMPS_RESOURCES}/example/gramps</mediapath>
  </header>
 '''
}
