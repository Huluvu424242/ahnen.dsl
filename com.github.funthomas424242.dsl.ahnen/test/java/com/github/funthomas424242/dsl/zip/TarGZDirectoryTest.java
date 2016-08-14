package com.github.funthomas424242.dsl.zip;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class TarGZDirectoryTest {

    @Test
    public void testCreateTarGZ() throws FileNotFoundException, IOException {
        TarGZDirectory.createTarGZ("test/resources/Thomas_Schubert/",
                "target/junit/Thomas_Schubert.tar.gz");
    }

}
