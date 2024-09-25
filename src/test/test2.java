package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2 {
	@Test(groups={"Smoke"})
	public void ploan() {
		// TODO Auto-generated method stub
		System.out.println("ploan");
	}
	
	@Test
	public void excecolu() {
		// TODO Auto-generated method stub
		System.out.println("exclude");
	}
	
	@BeforeMethod
	public void beforeMed() {
		System.out.println("Do this first before other tests!!!");
	}
	
	@BeforeTest
	public void prequisite() {
		System.out.println("Do this first before test!!!");
	}
	
	@AfterTest
	public void lastexecution() {
		System.out.println("Do this after test!!!");
	}

}
