//package mobile;
//
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class Main {
//    private static AppiumDriverLocalService server;
//    private static AppiumDriver driver;
//
//    public static WebElement getElement(By by) {
//        return new WebDriverWait(driver, 60)
//                .until(ExpectedConditions.presenceOfElementLocated(by));
//    }
//
//    public void timeSleep(int segundos) {
//        try {
//            Thread.sleep(segundos * 1000L);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @BeforeAll
//    public static void setUpServer() {
//        server = new AppiumServiceBuilder()
//                .usingPort(4723)
//                .withArgument(() -> "--base-path", "/wd/hub")
//                .build();
//        server.start();
//    }
//
//    @AfterAll
//    public static void tearDownServer() {
//        if (server != null) server.stop();
//        server = null;
//    }
//
//    @BeforeEach
//    public void setUpDriver() throws MalformedURLException {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("automationName", "uiautomator2");
//        capabilities.setCapability("deviceName", "192.168.18.121:41789");
//        capabilities.setCapability("ignoreHiddenApiPolicyError", true);
//        capabilities.setCapability("ensureWebviewsHavePages", true);
//        capabilities.setCapability("newCommandTimeout", 3600);
//        capabilities.setCapability("connectHardwareKeyboard", true);
//        capabilities.setCapability("unicodeKeyboard", false);
//        capabilities.setCapability("resetKeyboard", false);
//        capabilities.setCapability("app", "C:\\Users\\amilt\\Downloads\\Petz.apk");
//
//        URL url = new URL("http://127.0.0.1:4723/wd/hub");
//
//        driver = new AppiumDriver(url, capabilities);
//    }
//
//    @AfterEach
//    public void tearDownDriver() {
//        if (driver != null) driver.quit();
//        driver = null;
//    }
//
//
//    @Test
//    public void buscaProduto() {
//        WebElement continuarSemLogin = driver.findElement(By.xpath("//*[@resource-id='br.com.petz:id/et_user_name']"));
//        continuarSemLogin.click();
//    }
//}