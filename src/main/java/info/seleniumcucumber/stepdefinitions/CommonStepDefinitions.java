package info.seleniumcucumber.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import env.DriverUtil;
import info.seleniumcucumber.defind.Definder;
import info.seleniumcucumber.methods.BaseTest;
import info.seleniumcucumber.methods.TestCaseFailed;

public class CommonStepDefinitions implements BaseTest {
	protected WebDriver driver = DriverUtil.getDefaultDriver();
	protected Definder definder = new Definder();
	//Navigation Steps
	
	protected void onclick_to(String xpath) {
		clickObj.click("xpath", xpath);
	}

	@When("^I click on (.+) \"([^\\\"]*)\"")
	public void on_lick_login(String type, String name) {
		String xpath = definder.getElement(type, name);
		onclick_to(xpath);
	}
	
	@Given("^I open page \"([^\\\"]*)\"")
	public void open_page(String name) {
		String xpath = definder.getElement("page", name);
		navigationObj.navigateTo(xpath);
	}
	
	@Given("^I Enter text \"([^\\\"]*)\" to input \"([^\\\"]*)\"$")
	public void i_enter_text(String text, String name) {
		String accessName = definder.getElement("input", name);
		inputObj.enterText("xpath", text, accessName);
	}
	
	@Given("^I clear input \"([^\\\"]*)\"$")
	public void i_clear_text(String name) {
		String accessName = definder.getElement("input", name);
		inputObj.clearText("xpath", accessName);
	}
	
	@Then("^I have element (.+) \"([^\\\"]*)\"\\s*((?:not)?)\\s+show message as \"([^\\\"]*)\"")
	public void show_message_in_element(String type, String name,  String present, String message) throws TestCaseFailed {
		String xpath = definder.getElement(type, name);
		assertionObj.checkElementText("xpath", message,xpath, present.isEmpty());
	}
	

	@Then("^I have element input \"([^\\\"]*)\"\\s*((?:not)?)\\s+as \"([^\\\"]*)\"")
	public void text_input_in_element(String name,  String present, String message) throws TestCaseFailed {
		String accessName = definder.getElement("input", name);
		inputObj.CheckText("xpath", message, accessName, present.isEmpty());
	}
	
	@Then("^I have element (.+) \"([^\\\"]*)\"\\s*((?:not)?)\\s+have partial text as \"([^\\\"]*)\"")
	public void partial_text_in_element(String type, String name,  String present, String message) throws TestCaseFailed {
		String xpath = definder.getElement(type, name);
		assertionObj.checkElementPartialTextToLowerCase("xpath", message,xpath, present.isEmpty());
	}
	
	//step to check element present or not
	@Then("^Check element having (.+) \"(.*?)\" should\\s*((?:not)?)\\s+be present$")
	public void element_presence_exits(String type,String name,String present) throws Exception
	{
		String accessName = definder.getElement(type, name);
		assertionObj.checkElementPresence("xpath", accessName, present.isEmpty());
	}
	
	// Note: Doesn't work on Windows firefox
	@Then("^I hover over element (.+) \"(.*?)\"$")
	public void i_hover_over_element(String type, String name) throws Exception
	{
		String accessName = definder.getElement(type, name);
		navigationObj.hoverOverElement("xpath", accessName);
	}
}
