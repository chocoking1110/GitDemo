package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test3 {
	
	@AfterSuite
	public void AfterSu() {
		System.out.println("Run this after Test Suite Execution");
	}
	@Test(groups={"Smoke"})
	public void WebLoginCarLoan() {
		// TODO Auto-generated method stub
		System.out.println("web login");
	}
	
	@Parameters({"url", "apikey"})
	@Test(groups={"Smoke"})
	public void MobileLoginCarLoan(String link, String apikey) {
		// TODO Auto-generated method stub
		System.out.println("mobile login link "+link);
		System.out.println("mobile login link "+apikey);
	}
	
	
	@Test(dataProvider="getData",groups={"Smoke"})
	public void MobileSignOutCarLoan(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("MOBILE SIGN OUT");
		System.out.println("mobile account "+username);
		System.out.println("mobile password "+password);
	}
	
	@Test
	public void APILoginCarLoan() {
		// TODO Auto-generated method stub
		System.out.println("API login");
	}
	
	@BeforeSuite
	public void BeforeSu() {
		System.out.println("Run this before Test Suite Execution");
	}
	
	@DataProvider
	public Object[][] getData() {
		// user name password good credit card history
		// user name password no credit card history
		// user name password bad credit card history
		Object[][] data = new Object[3][2];
		data[0][0]="1st username";
		data[0][1]="1st password";
		
		data[1][0]="2nd username";
		data[1][1]="2nd password";
		
		data[2][0]="3rd username";
		data[2][1]="3rd password";
		
		return data;
	}
}
