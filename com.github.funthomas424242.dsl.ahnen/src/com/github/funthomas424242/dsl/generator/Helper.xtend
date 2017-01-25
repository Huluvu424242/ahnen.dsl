package com.github.funthomas424242.dsl.generator

import com.github.funthomas424242.dsl.ahnen.Familienbuch
import com.github.funthomas424242.files2gramps.GrampsExporter
import java.io.File
import java.io.FileNotFoundException
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.logging.Level
import java.util.logging.Logger
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess2

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class Helper {

    var static Logger logger = Logger.getLogger("Helper");

    def static getPOMFileName(Familienbuch buch) {
        return "familienbuch_" + buch.name + "/docbook/pom.xml";
    }

    def static getDbkFileName(Familienbuch buch, String fileName) {
        return "familienbuch_" + buch.name + "/docbook/src/main/docbkx/" + fileName;
    }

    def static getGeneratedBookDirectory(Familienbuch buch) {
        return "familienbuch_" + buch.name;
    }

    def static getGrampsDBFileName(Familienbuch buch) {
        return "familienbuch_" + buch.name + "/gramps/data.xml";
    }
    
    def static getGrampsArchiveFileName(Familienbuch buch) {
        return "familienbuch_" + buch.name + "/gramps/"+buch.name + ".gpkg";
    }

    def static File getMediaFolderFile(Familienbuch buch, IFileSystemAccess2 fsa) {
        var URI mediaFolderURI=fsa.getURI(".."+File.separator+buch.mediaFolder);
        return convertURI2File(buch,mediaFolderURI);
    }


    def static File convertURI2File(Familienbuch buch, URI uri) {
        
        logger.log(Level.FINEST,"Convert URI: "+uri.toString());
        val uriIFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true)));
        logger.log(Level.FINEST,"Resolved Location: "+uriIFile.getLocation());
        logger.log(Level.FINEST,"Resolved FilePath: "+uriIFile.getLocation().toFile().getAbsolutePath());
        var File uriFile=uriIFile.getLocation().toFile();
        logger.log(Level.INFO,"to File: "+uriFile.getAbsolutePath());
        return uriFile;
    }


    def static stripQuotes(String text) {
        return text.substring(1, text.length - 1)
    }

//	def static getFileRef(Bild bild) {
//
//		if (bild.ablageort instanceof Internetpfad) {
//			val ablage = bild.ablageort as Internetpfad;
//			return ablage.url
//		} else {
//			val ablage = bild.ablageort as Lokalerpfad;
//			return ablage.fileName
//		}
//	}
    def static EObject resourceToEObject(Resource resource) {
        return resource?.allContents?.head;
    }

    def static Resource openImport(Resource contextResource, String importedURIAsString) {
        val URI contextURI = contextResource?.getURI
        val URI importedURI = URI?.createURI(importedURIAsString)
        val URI resolvedURI = importedURI?.resolve(contextURI)

        val ResourceSet contextResourceSet = contextResource?.resourceSet
        val Resource resource = contextResourceSet?.getResource(resolvedURI, true)
        return resource
    }

    def static String convertDateToDefaultLocale(String datum) {
        val String yyyy = datum.substring(6, 10)
        val String mm = datum.substring(3, 5)
        val String dd = datum.substring(0, 2)
        return (yyyy + '-' + mm + '-' + dd)
    }


    def static void createTarGZ(File targetFile, File grampsDBFile,
        File mediaFolderFile) throws FileNotFoundException, IOException {

        logger.log(Level.INFO,"TargetFile: "+targetFile.getAbsolutePath());
        logger.log(Level.INFO,"GrampsFile: "+grampsDBFile.getAbsolutePath());
        if( mediaFolderFile != null){
            logger.log(Level.INFO,"MediaFolder: "+mediaFolderFile.getAbsolutePath());
        }

        var GrampsExporter exporter = new GrampsExporter("ahnen", grampsDBFile, targetFile, mediaFolderFile);
        exporter.createExportfile();
    }
    
    def static String getGrampsStandardDate() {
        var SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(System.currentTimeMillis());
    }
    
}
