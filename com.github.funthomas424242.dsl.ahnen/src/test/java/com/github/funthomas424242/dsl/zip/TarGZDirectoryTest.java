package com.github.funthomas424242.dsl.zip;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class TarGZDirectoryTest {

    @Before
    public void setUp() throws IOException {
        final File contentFile = new File("content.xml");
        contentFile.createNewFile();
    }

    @Test
    public void testCreateTarGZ() throws FileNotFoundException, IOException {
        TarGZDirectory.createTarGZ("test/resources/Thomas_Schubert/",
                "target/junit/Thomas_Schubert.tar.gz");
    }

}
