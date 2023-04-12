package org.trabalho.automacao.mobile.bdd;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportUtils {
    private static ExtentHtmlReporter htmlReporter;
    private static ExtentReports extent;
    private static ExtentTest test;

    public static void startReport() {
        htmlReporter = new ExtentHtmlReporter("extent.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("OS", "Windows 10");
        extent.setSystemInfo("Browser", "Chrome");
        htmlReporter.config().setDocumentTitle("Extent Report Demo");
        htmlReporter.config().setReportName("Test Report");
        htmlReporter.config().setTheme(Theme.DARK);
    }

    public static void createTest(String testName) {
        test = extent.createTest(testName);
    }

    public static void logInfo(String message) {
        test.log(Status.INFO, MarkupHelper.createLabel(message, ExtentColor.BLUE));
    }

    public static void logPass(String message) {
        test.log(Status.PASS, MarkupHelper.createLabel(message, ExtentColor.GREEN));
    }

    public static void logFail(String message) {
        test.log(Status.FAIL, MarkupHelper.createLabel(message, ExtentColor.RED));
    }

    public static void addScreenshot(String screenshotPath) {
        try {
            test.addScreenCaptureFromPath(screenshotPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void endReport() {
        extent.flush();
    }
}

