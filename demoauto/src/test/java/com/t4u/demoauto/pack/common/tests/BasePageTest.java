package com.t4u.demoauto.pack.common.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.t4u.demoauto.pack.base.TestBaseSetup;
import com.t4u.demoauto.pack.common.pageobjects.BasePage;

public class BasePageTest extends TestBaseSetup{
	private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}
	
	@Test
	public void verifyHomePage() {
		System.out.println("Home page test...");
		BasePage basePage = new BasePage(driver);
		Assert.assertTrue(basePage.verifyBasePageTitle(), "Home page title doesn't match");
	}

}
