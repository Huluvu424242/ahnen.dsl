/*
 * generated by Xtext 2.10.0
 */
package com.github.funthomas424242.dsl.generator

import com.github.funthomas424242.dsl.ahnen.Familienbuch
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AhnenGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (buch : resource.allContents.toIterable.filter(Familienbuch)) {
			fsa.generateFile(POMGenerator.getPOMFileName(buch), POMGenerator.createPOMContent(buch))
			fsa.generateFile(Helper.getDbkFileName(buch, "book.dbk"), BookGenerator.createBookContent(fsa, buch))
		}
	}
}
