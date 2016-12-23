//package angularjs.e2etest;
//
//import static org.junit.Assert.fail;
//
//import java.io.File;
//
//import org.jboss.arquillian.container.test.api.Deployment;
//import org.jboss.arquillian.junit.Arquillian;
//import org.jboss.shrinkwrap.api.ShrinkWrap;
//import org.jboss.shrinkwrap.api.spec.WebArchive;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.openqa.selenium.By;
//import org.openqa.selenium.TimeoutException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//@RunWith(Arquillian.class)
//public class E2ETest {
//
//    @Deployment(testable = false)
//    public static WebArchive accessDeployment() {
//        final File war = MavenDependencyResolver.resolve(
//                "com.github.funthomas424242",
//                "com.github.funthomas424242.dsl.ahnen.web", "1.0.0-SNAPSHOT",
//                null, "war");
//        return ShrinkWrap.createFromZipFile(WebArchive.class, war);
//    }
//
//    @Test
//    public void runE2ETest() {
//        final WebDriver driver = new HtmlUnitDriver(true);
//        driver.get(
//                "http://localhost:8180/blog/angularjs-scenario-runner/runner.html");
//
//        try {
//            new WebDriverWait(driver, 200)
//                .until(new ExpectedCondition<Boolean>() {
//
//                    @Override
//                    public Boolean apply(final WebDriver driver) {
//                        return !driver.findElement(By.id("application"))
//                            .isEnabled();
//                    }
//                });
//
//        } catch (final TimeoutException e) {
//            fail("Image preview is not displayed on ");
//        }
//    }
//}