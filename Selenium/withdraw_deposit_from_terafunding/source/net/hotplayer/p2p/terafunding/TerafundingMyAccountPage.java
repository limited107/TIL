package net.hotplayer.p2p.terafunding;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import net.hotplayer.selenium.utils.WebDriverUtils;

/**
 * https://www.terafunding.com/Auth/Login
 * https://www.terafunding.com/Member/MyPage
 * https://www.terafunding.com/Member/MyAccount
 */

public class TerafundingMyAccountPage {
	private WebDriver driver;
	private String url = "https://www.terafunding.com/Member/MyAccount";

	@FindBy(how=How.ID, using="all_btn")
	private WebElement allBalanceButton;

	@FindBy(how=How.ID, using="btnWithdrawConfirm")
	private WebElement withdrawConfirmButton;

	public TerafundingMyAccountPage(WebDriver driver) {
		this.driver = driver;
		driver.get(url);
		PageFactory.initElements(driver, this);
	}

	public WebDriver withdrawAll() {
		if (driver.getCurrentUrl() != url)
			driver.get(url);
		allBalanceButton.click();
		withdrawConfirmButton.click();
		Alert alert = WebDriverUtils.waitForAlert(driver);
		alert.accept();
		return driver;
	}
}
