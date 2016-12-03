package com.github.funthomas424242.dsl.generator

import com.github.funthomas424242.dsl.ahnen.Familienbuch
import com.github.funthomas424242.files2gramps.GrampsExporter
import java.io.File
import java.io.FileNotFoundException
import java.io.IOException
import java.util.logging.Level
import java.util.logging.Logger
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet

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
        return "familienbuch_" + buch.name + "/gramps/"+buch.name + ".dpkg";
    }

//    def static getGrampsArchiveFile(Familienbuch buch, IFileSystemAccess2 fsa) {
//        
//        val platformString = buch.eResource.URI.toPlatformString(true);
//        val myFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformString));
//        
//        val proj = myFile.getProject();
//        var URI grampsFolder = fsa.getURI("familienbuch_" + buch.name + "/gramps/");
//        val IFolder grampsFolderFolder = proj.getFolder(grampsFolder.path());
//        logger.log(Level.INFO,"Resource: "+grampsFolderFolder.getFullPath().toOSString());
//        
//        var File grampsFolderFile=grampsFolderFolder.getFullPath().toFile();
//        grampsFolderFile.mkdirs();
//        var File grampsArchiveFile = new File(grampsFolderFile, buch.name + ".dpkg");
//        logger.log(Level.INFO,"GrampsArchiveFile: "+grampsArchiveFile.getAbsolutePath());
//        return grampsArchiveFile;
//    }

    def static File convertURI2File(Familienbuch buch, URI uri) {
        
        logger.log(Level.INFO,"Convert URI: "+uri.toString());
        val platformString = buch.eResource.URI.toPlatformString(true);
        val buchFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformString));
        val project = buchFile.getProject();
        
        val IFile uriIFile = project.getFile(uri.path());
        var File uriFile=uriIFile.getFullPath().toFile();
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
        logger.log(Level.INFO,"MediaFolder: "+mediaFolderFile.getAbsolutePath());


        var GrampsExporter exporter = new GrampsExporter("ahnen", grampsDBFile, targetFile, mediaFolderFile);
        exporter.createExportfile();

//        var FileOutputStream fOut = null;
//        var BufferedOutputStream bOut = null;
//        var GzipCompressorOutputStream gzOut = null;
//        var TarArchiveOutputStream tOut = null;
//        try {
//            System.out.println("LOG:" + new File(".").getAbsolutePath());
//            var String dirPath = quellDirectoryPath;
//            // final String dirPath = "parent/childDirToCompress/";
//            var String tarGzPath = targetFilePath;
//            // final String tarGzPath = "archive.tar.gz";
//            fOut = new FileOutputStream(new File(tarGzPath));
//            bOut = new BufferedOutputStream(fOut);
//            gzOut = new GzipCompressorOutputStream(bOut);
//            tOut = new TarArchiveOutputStream(gzOut);
//            addFileToTarGz(tOut, dirPath, "");
//        } finally {
//            tOut.finish();
//            tOut.close();
//            gzOut.close();
//            bOut.close();
//            fOut.close();
//        }
    }
    
   

//    def static void addFileToTarGz(TarArchiveOutputStream tOut, String path, String base) throws IOException {
//        var File f = new File(path);
//        System.out.println("LOG:" + f.exists());
//        var String entryName = base + f.getName();
//        var TarArchiveEntry tarEntry = new TarArchiveEntry(f, entryName);
//        tOut.putArchiveEntry(tarEntry);
//
//        if (f.isFile()) {
//            IOUtils.copy(new FileInputStream(f), tOut);
//            tOut.closeArchiveEntry();
//        } else {
//            tOut.closeArchiveEntry();
//            var File[] children = f.listFiles();
//            if (children != null) {
//                for (File child : children) {
//                    System.out.println(child.getName());
//                    addFileToTarGz(tOut, child.getAbsolutePath(), entryName + "/");
//                }
//            }
//        }
//    }
}
