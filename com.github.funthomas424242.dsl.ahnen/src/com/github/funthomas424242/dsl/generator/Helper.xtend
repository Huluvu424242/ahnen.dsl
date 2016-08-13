package com.github.funthomas424242.dsl.generator

import com.github.funthomas424242.dsl.ahnen.Familienbuch
import java.io.BufferedOutputStream
import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.apache.commons.compress.archivers.tar.TarArchiveEntry
import org.apache.commons.compress.utils.IOUtils

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class Helper {

    def static getPOMFileName(Familienbuch buch) {
        return "familienbuch_"+buch.name+"/docbook/pom.xml";
    }

    def static getDbkFileName(Familienbuch buch, String fileName) {
        return "familienbuch_" + buch.name + "/docbook/src/main/docbkx/" + fileName;
    }

    def static getGeneratedBookDirectory(Familienbuch buch){
        return "familienbuch_"+buch.name;
    }

    def static getGrampsFileName(Familienbuch buch) {
        return "familienbuch_" + buch.name + "/gramps/"+buch.name+".dpkg";
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

    def static FileInputStream createTarGZContent(String quellDirectoryPath, String targetFilePath) {
        createTarGZ(quellDirectoryPath, targetFilePath);
        return new FileInputStream(targetFilePath);
    }

    def static void createTarGZ(String quellDirectoryPath,
        String targetFilePath) throws FileNotFoundException, IOException {

        var FileOutputStream fOut = null;
        var BufferedOutputStream bOut = null;
        var GzipCompressorOutputStream gzOut = null;
        var TarArchiveOutputStream tOut = null;

        try {
            System.out.println("LOG:" + new File(".").getAbsolutePath());
            var String dirPath = quellDirectoryPath;
            // final String dirPath = "parent/childDirToCompress/";
            var String tarGzPath = targetFilePath;
            // final String tarGzPath = "archive.tar.gz";
            fOut = new FileOutputStream(new File(tarGzPath));
            bOut = new BufferedOutputStream(fOut);
            gzOut = new GzipCompressorOutputStream(bOut);
            tOut = new TarArchiveOutputStream(gzOut);
            addFileToTarGz(tOut, dirPath, "");
        } finally {
            tOut.finish();
            tOut.close();
            gzOut.close();
            bOut.close();
            fOut.close();
        }
    }

    def static void addFileToTarGz(TarArchiveOutputStream tOut, String path, String base) throws IOException {
        var File f = new File(path);
        System.out.println("LOG:" + f.exists());
        var String entryName = base + f.getName();
        var TarArchiveEntry tarEntry = new TarArchiveEntry(f, entryName);
        tOut.putArchiveEntry(tarEntry);

        if (f.isFile()) {
            IOUtils.copy(new FileInputStream(f), tOut);
            tOut.closeArchiveEntry();
        } else {
            tOut.closeArchiveEntry();
            var File[] children = f.listFiles();
            if (children != null) {
                for (File child : children) {
                    System.out.println(child.getName());
                    addFileToTarGz(tOut, child.getAbsolutePath(), entryName + "/");
                }
            }
        }
    }

}
