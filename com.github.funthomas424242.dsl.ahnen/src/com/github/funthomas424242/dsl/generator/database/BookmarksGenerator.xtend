package com.github.funthomas424242.dsl.generator.database

import com.github.funthomas424242.dsl.ahnen.Familienbuch

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class BookmarksGenerator{
	
	def static createContent(Familienbuch buch) '''
    <bookmarks></bookmarks>
	'''
}

//
// <bookmarks>
//    <bookmark target="person" hlink="_AWFKQCJELLUWDY2PD3"/>
//    <bookmark target="person" hlink="_35WJQC1B7T7NPV8OLV"/>
//    <bookmark target="person" hlink="_Q8HKQC3VMRM1M6M7ES"/>
//    <bookmark target="family" hlink="_9OUJQCBOHW9UEK9CNV"/>
//  </bookmarks>