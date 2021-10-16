package Rediff_ObjRepositoryTestCases;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Rediff_ObjRepository.LandingPage;
import Rediff_ObjRepository.MoneyPage;
import Rediff_ObjRepository.MyPorfolioPage;
import Rediff_ObjRepository.PortFolioLoginPage;
import Rediff_ObjRepository.BaseTestClass;
import Rediff_ObjRepository.PageBaseClass;

public class MyPorfolioTest extends BaseTestClass{
	
	LandingPage landingPage;
	MoneyPage moneyPage;
	PortFolioLoginPage portfolioLoginPage;
	MyPorfolioPage myporfolioPage;
	
//	@Test
	public void openPorfolio(){
		
		
		invokeBrowser("chrome");
		PageBaseClass pageBase = new PageBaseClass(driver);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		moneyPage =landingPage.clickMoneyLink();
		portfolioLoginPage = moneyPage.clickSingInLink();
		myporfolioPage = portfolioLoginPage.doLogin("mailme_jyo123", "Prasad@123");
		//myporfolioPage.verifyMoneyBiz();
		//myporfolioPage.getTitle("Rediff Moneywiz | My Portfolio(s)");
			}
	
	//@Test(dataProvider="verifyLoginTestData", groups={"Regression", "LoginTest" })
	public void verifyLogin(){
		
		invokeBrowser("chrome");
		PageBaseClass pageBase = new PageBaseClass(driver);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		moneyPage =landingPage.clickMoneyLink();
		portfolioLoginPage = moneyPage.clickSingInLink();
		portfolioLoginPage.enterUser("mailme_jyo123");
		portfolioLoginPage.submitUserName();
		//below one line added - 5th may 2021
		//portfolioLoginPage.enterPassword(testData.get("Password"));
		portfolioLoginPage.verifyPasswordField();
		
	}
	
	@Test
	public void addPortfolioTest(){

		invokeBrowser("chrome");
		PageBaseClass pageBase = new PageBaseClass(driver);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		moneyPage =landingPage.clickMoneyLink();
		portfolioLoginPage = moneyPage.clickSingInLink();
		myporfolioPage = portfolioLoginPage.doLogin("mailme_jyo123", "Prasad@123");
		myporfolioPage.verifyMoneyBiz();
		myporfolioPage.clickCreatePortfolio();
		waitForPageLoad();
		myporfolioPage.enterPortfolioName("New Portfolio-14oct2021");
		myporfolioPage = myporfolioPage.submitPortfolio();
		waitForPageLoad();
		myporfolioPage.isPorfolioExists("New Portfolio-14oct2021");
	}
	
	
	
	public void deletePortfolio(){
		System.out.println("In Delete portfolio - starting");
		
		invokeBrowser("chrome");
		PageBaseClass pageBase = new PageBaseClass(driver);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		moneyPage =landingPage.clickMoneyLink();
		portfolioLoginPage = moneyPage.clickSingInLink();
		myporfolioPage = portfolioLoginPage.doLogin("mailme_jyo123", "Prasad@123");
		waitForPageLoad();
		myporfolioPage.verifyMoneyBiz();
		myporfolioPage = myporfolioPage.selectPortfolio("New Portfolio");
		myporfolioPage = myporfolioPage.deletePortFolio();
		waitForPageLoad();
		myporfolioPage.isPorfolioDeleted("New Portfolio");
		System.out.println("In Delete portfolio - Ending");
	}
	


}
