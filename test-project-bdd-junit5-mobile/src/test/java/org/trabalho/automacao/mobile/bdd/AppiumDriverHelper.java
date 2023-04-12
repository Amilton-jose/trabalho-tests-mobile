package org.trabalho.automacao.mobile.bdd;

import io.appium.java_client.AppiumDriver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Slf4j
public class AppiumDriverHelper {

    public static DesiredCapabilities getCapabilities(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("deviceName", "192.168.18.121:43049");
        capabilities.setCapability("ignoreHiddenApiPolicyError", true);
        capabilities.setCapability("ensureWebviewsHavePages", true);
        capabilities.setCapability("newCommandTimeout", 3600);
        capabilities.setCapability("connectHardwareKeyboard", true);
        capabilities.setCapability("unicodeKeyboard", false);
        capabilities.setCapability("resetKeyboard", false);
        capabilities.setCapability("app", "C:\\Users\\amilt\\Downloads\\Petz.apk");

        return capabilities;
    }

    public static URL getUrl() throws MalformedURLException {
        return new URL("http://127.0.0.1:4723/wd/hub");
    }

    public static AppiumDriver getDriver(){
        AppiumDriver driver = null;
        try {
          driver = new AppiumDriver(getUrl(),getCapabilities());
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            log.error("Erro na instanciação do driver.", e);
            throw new RuntimeException(e);
        }
        return driver;
    }
}
