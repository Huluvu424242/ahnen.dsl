package com.github.funthomas424242.dsl.generator.database

import com.github.funthomas424242.dsl.ahnen.Familienbuch

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class NameMapsGenerator{
	
	def static createContent(Familienbuch buch) '''
  <namemaps>
    <map type="group_as" key="Fernández" value="Fernandez"/>
  </namemaps>
	'''
	}
