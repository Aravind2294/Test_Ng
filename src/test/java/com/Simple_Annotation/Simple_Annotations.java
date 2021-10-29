package com.Simple_Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	private void serproperty() {
		System.out.println("Set Property");
	}

	@BeforeTest
	private void browserlaunch() {
		System.out.println("Browser Launch");
	}

	@BeforeClass
	private void url() {
		System.out.println("URL");
	}

	@BeforeMethod
	private void login() {
		System.out.println("Login");
	}

	@Test
	private void laptop() {
		System.out.println("Laptop");
	}

	@Test
	private void mobile() {
		System.out.println("Mobile");
	}

	@Test
	private void earphone() {
		System.out.println("Earphone");
	}

	@AfterMethod
	private void logout() {
		System.out.println("Logout");
	}

	@AfterClass
	private void homepage() {
		System.out.println("Home Page");
	}

	@AfterTest
	private void close() {
		System.out.println("Close");
	}

	@AfterSuite
	private void deleteallcookies() {
		System.out.println("Delete cookies");
	}

}
