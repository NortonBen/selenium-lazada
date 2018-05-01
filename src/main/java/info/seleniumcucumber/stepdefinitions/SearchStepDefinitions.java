package info.seleniumcucumber.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import env.DriverUtil;
import info.seleniumcucumber.defind.Definder;
import info.seleniumcucumber.methods.BaseTest;
import info.seleniumcucumber.methods.TestCaseFailed;

public class SearchStepDefinitions  implements BaseTest {
	protected WebDriver driver = DriverUtil.getDefaultDriver();
	protected Definder definder = new Definder();
	
	@Then("^I have some any Product result search$")
	public void i_have_ids_result(List<String> products) throws TestCaseFailed {
		for (String product : products) {
			String accessName = "//div[@data-item-id='"+product+"']";
			assertionObj.checkElementPresence("xpath", accessName, true);
		}
	}
	
	@Then("^Search Not Result$")
	public void seach_not_result() throws TestCaseFailed {
		assertionObj.checkElementPresence("xpath", "//div[@data-item-id]", false);
	}

}
