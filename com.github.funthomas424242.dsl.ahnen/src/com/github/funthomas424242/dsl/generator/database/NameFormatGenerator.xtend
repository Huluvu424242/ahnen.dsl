package com.github.funthomas424242.dsl.generator.database

import com.github.funthomas424242.dsl.ahnen.Familienbuch

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class NameFormatGenerator {

    def static createContent(Familienbuch buch) '''
        <name-formats>
          <format number="-1" name="SURNAME, Given (Common)" fmt_str="SURNAME, given (common)" active="1"/>
        </name-formats>
    '''
}
