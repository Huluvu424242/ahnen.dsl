package com.github.funthomas424242.dsl.generator.database

import com.github.funthomas424242.dsl.ahnen.Familienbuch

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RepositoriesGenerator{
	
	def static createContent(Familienbuch buch) '''
  <repositories>
    <repository handle="_a701e99f93e5434f6f3" change="1328027438" id="R0002">
      <rname>New York Public Library</rname>
      <type>Library</type>
      <address>
        <street>5th Ave at 42 street</street>
        <city>New York</city>
        <state>New York</state>
        <country>USA</country>
        <postal>11111</postal>
        <citationref hlink="_c140e0925ac0adcf8c4"/>
      </address>
    </repository>
    <repository handle="_a701ead12841521cd4d" change="1185438865" id="R0003">
      <rname>Aunt Martha's Attic</rname>
      <type>Collection</type>
      <address>
        <street>123 Main St</street>
        <city>Someville</city>
        <state>ST</state>
        <country>USA</country>
      </address>
      <url  href="http://library.gramps-project.org" type="Web Home"/>
      <noteref hlink="_ac3804aac6b762b75a5"/>
    </repository>
    <repository handle="_b39fe38593f3f8c4f12" change="1234370614" id="R0000">
      <rname>Public Library Great Falls</rname>
      <type>Library</type>
      <address>
        <street>Bookstore street 5</street>
        <city>Great Falls</city>
        <state>MT</state>
        <country>USA</country>
      </address>
      <url  href="http://great-falls.org" type="Web Home"/>
      <noteref hlink="_b39fe2e143d1e599450"/>
    </repository>
  </repositories>
	'''
	}
