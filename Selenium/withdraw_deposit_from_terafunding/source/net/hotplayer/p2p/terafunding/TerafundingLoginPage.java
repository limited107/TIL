package net.hotplayer.p2p.terafunding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * https://www.terafunding.com/Auth/Login
 * https://www.terafunding.com/Member/MyPage
 * https://www.terafunding.com/Member/MyAccount
 */

public class TerafundingLoginPage {
	private WebDriver driver;
	private String url = "https://www.terafunding.com/Auth/Login";

	@FindBy(how=How.ID, using="UserId")
	private WebElement userIdInput;

	@FindBy(how=How.ID, using="Password")
	private WebElement passwordInput;

	public TerafundingLoginPage(WebDriver driver) {
		this.driver = driver;
		driver.get(url);
		PageFactory.initElements(driver, this);
	}

	public WebDriver login(String userId, String password) {
		userIdInput.sendKeys(userId);
		passwordInput.sendKeys(password);
		passwordInput.submit();

		return driver;
	}
}
