package com.github.funthomas424242.dsl.generator.database

import com.github.funthomas424242.dsl.ahnen.FamilienImport
import com.github.funthomas424242.dsl.ahnen.Familienbuch
import java.util.HashSet

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DataXMLGenerator {

  
    
    
    

    def static createGrampsDBContent(Familienbuch buch) {
       // Alle Familien im Buch ermitteln
       var HashSet<String> familien = new HashSet<String>();
       for( FamilienImport familienImport:buch.familien){
        familien.add(familienImport.familie.name);
       }
       // data.gramps content erstellen
       return createDatabaseBeginTag()+
        HeaderGenerator.createHeader(buch)+
        NameFormatGenerator.createContent(buch)+
        TagsGenerator.createContent(buch)+
        EventsGenerator.createContent(buch)+
        PeopleGenerator.createContent(buch,familien)+
        FamiliesGenerator.createContent(buch)+
        CitationsGenerator.createContent(buch)+
        SourcesGenerator.createContent(buch)+
        PlacesGenerator.createContent(buch)+
        ObjectsGenerator.createContent(buch)+
        RepositoriesGenerator.createContent(buch)+
        NotesGenerator.createContent(buch)+
        BookmarksGenerator.createContent(buch)+
        NameMapsGenerator.createContent(buch)+
        createDatabaseEndTag();
    }
    
     def static createDatabaseBeginTag() '''
     <?xml version="1.0" encoding="UTF-8"?>
     <!DOCTYPE database PUBLIC "-//Gramps//DTD Gramps XML 1.6.0//EN"
     "http://gramps-project.org/xml/1.6.0/grampsxml.dtd">
     <database xmlns="http://gramps-project.org/xml/1.6.0/">
     '''
     
     
      def static createDatabaseEndTag() '''
     </database>
     '''
     
}
