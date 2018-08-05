package net.hotplayer.p2p.terafunding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TerafundingTest {
	public static void main(String args[]) {
		WebDriver driver = null;
		try {
			String userId = "userId";
			String password = "password";

			System.setProperty("webdriver.chrome.driver", "/Users/cole.c/program/src/chromedriver-v2.40/chromedriver");
			ChromeOptions options = new ChromeOptions();
//		options.addArguments("headless");
			options.addArguments("window-size=1200x600");

			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

			TerafundingLoginPage terafundingLoginPage = new TerafundingLoginPage(driver);
			terafundingLoginPage.login(userId, password);

			TerafundingMyAccountPage myAccountPage = new TerafundingMyAccountPage(driver);
			myAccountPage.withdrawAll();
		} finally {
			driver.close();
		}
	}
}
