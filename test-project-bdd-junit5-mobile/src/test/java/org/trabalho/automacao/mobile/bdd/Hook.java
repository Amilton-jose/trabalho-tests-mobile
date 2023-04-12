package org.trabalho.automacao.mobile.bdd;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


@Slf4j
public class Hook {
    private static AppiumDriverLocalService server;
    private static AppiumDriver driver;

    @BeforeAll
    public static void setUpServer(){
        log.info("Inicializando o servidor do Appium");

        server = new AppiumServiceBuilder()
                .usingPort(4723)
                .withArgument(() -> "--base-path", "/wd/hub")
                .build();
        server.start();
    }

    @AfterAll
    public static void tearDownServer(){
        log.info("Finalizando o servidor do Appium.");
        if (server != null) server.stop();
        server = null;
    }

    @Before
    public void setUpDriver(){
        log.info("Inicializando o driver");
        driver = AppiumDriverHelper.getDriver();
    }

    @After
    public void tearDownDriver(){
        if (driver != null) driver.quit();
        driver = null;
    }

    public static AppiumDriver getDriver(){
        return driver;

    }
}
