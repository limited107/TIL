package net.hotplayer.selenium.utils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {
	private static final int DEFAULT_ALERT_WAIT_TIMEOUT = 10;

	public static Alert waitForAlert(WebDriver driver) {
		return waitForAlert(driver, DEFAULT_ALERT_WAIT_TIMEOUT);
	}

	public static Alert waitForAlert(WebDriver driver, Integer timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		return alert;
	}

	public static By cssSelector(CssSelector cssSelector) {
		return By.cssSelector(cssSelector.toString());
	}

	public static By cssSelector(String tagName, String attribute, String value) {
		return cssSelector(new CssSelector(tagName, attribute, value));
	}

	public static void unchecked(WebDriver driver, WebElement checkboxElem) {
		if (checkboxElem.isSelected()) {
			Actions actions = new Actions(driver);
			actions.moveToElement(checkboxElem).click().build().perform();
		}
	}

	public static void checked(WebDriver driver, WebElement checkboxElem) {
		if (!checkboxElem.isSelected()) {
			Actions actions = new Actions(driver);
			actions.moveToElement(checkboxElem).click().build().perform();
		}
	}

	public static void takeScreenshot(WebDriver driver) throws IOException {
		takeScreenshot(driver, LocalDateTime.now().format(DateTimeFormatter.ofPattern("kk-mm-ss")));
	}

	public static void takeScreenshot(WebDriver driver, String filename) throws IOException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String targetDir = "target/screenshots/" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		FileUtils.forceMkdir(new File(targetDir));
		FileUtils.copyFile(file, new File(targetDir + "/" + filename + ".png"));
	}
}
