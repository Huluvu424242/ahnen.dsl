package com.github.funthomas424242.dsl.generator;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import javax.inject.Inject;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.github.funthomas424242.dsl.tests.AhnenInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(AhnenInjectorProvider.class)
public class HelperTest {

    @Inject
    Helper helper;

    @Test
    public void setUpTest() {
        assertNotNull(helper);
    }

    @Test
    @Ignore
    public void testGetPOMFileName() {
        fail("Not yet implemented");
    }

    @Test
    @Ignore
    public void testGetDbkFileName() {
        fail("Not yet implemented");
    }

    @Test
    @Ignore
    public void testGetGeneratedBookDirectory() {
        fail("Not yet implemented");
    }

    @Test
    @Ignore
    public void testGetGrampsFileName() {
        fail("Not yet implemented");
    }

    @Test
    @Ignore
    public void testCreateTarGZContent() {
        fail("Not yet implemented");
    }

    @Test
    @Ignore
    public void testCreateTarGZ() {
        fail("Not yet implemented");
    }

}
