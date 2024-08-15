package utilities;

import io.cucumber.java.*;

public class Hooks {
    @BeforeAll
    public static void beforeAll() {

    }

    @Before // Buradaki Before BeforeScenario demek.
    public void before() {
        DriverFactory.setDriver();
    }

    @BeforeStep
    public void beforeStep() {
    }

    @AfterStep
    public void afterStep() {
    }

    @After // Buradaki After AfterScenario demek
    public void after() {
        DriverFactory.quitDriver();
    }

    @AfterAll
    public static void afterAll() {
    }
}
