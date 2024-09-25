package test;

import org.testng.annotations.Test;

public class test1 {

	@Test(dependsOnMethods= {"salut"})
	public void demo() {
		// TODO Auto-generated method stub
		System.out.println("Bonjour");
	}

	@Test
	public void salut() {
		// TODO Auto-generated method stub
		System.out.println("Salut");
	}
	
	@Test
	public void aurevoir() {
		// TODO Auto-generated method stub
		System.out.println("Au revoir");
	}
}
