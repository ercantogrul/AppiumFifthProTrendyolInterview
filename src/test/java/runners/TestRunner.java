package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"stepdefinitions", "utilities"},
        tags = "@TrendyolInterviewFeature",
        dryRun = false,
        plugin = {
                "pretty",
                "summary", // ciktiyi özet haline getiriyor
                "html:target/reports/Ercan/Android/cucumber-report.html"  // cucumber report un eklenecek yeri tarif ediyoruz
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
