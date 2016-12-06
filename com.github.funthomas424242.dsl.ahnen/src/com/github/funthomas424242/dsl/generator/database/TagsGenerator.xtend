package com.github.funthomas424242.dsl.generator.database

import com.github.funthomas424242.dsl.ahnen.Familienbuch

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class TagsGenerator{
	
	def static createContent(Familienbuch buch) '''
  <tags>
  </tags>
	'''
//    def static createContent(Familienbuch buch) '''
//  <tags>
//    <tag handle="_bb80c229eef1ee1a3ec" change="1288512479" name="complete" color="#076780873bf0" priority="1"/>
//    <tag handle="_bb80c2b235b0a1b3f49" change="1288512442" name="ToDo" color="#efb60c280c28" priority="0"/>
//  </tags>
//    '''

}
