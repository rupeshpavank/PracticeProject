package com.TestProject.Practice;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
@BeforeSuite
public void beforeSuite() {
System.out.println("Before Suite");
}

@BeforeClass
public void beforeClass() {
	System.out.println("Before Class");
}
@BeforeTest
public void beforeTest() {
	
	System.out.println("In Before Test");
}

@BeforeMethod
public void beforeMethod() {
	System.out.println("In Before Method");

	
}
  @Test
  public void f() {
	  System.out.println("In Test Method");
	  Assert.assertEquals("", "");
  }
  
  @Test
  public void g() {
	  System.out.println("In Test Method 2");
	  Assert.assertEquals("", "");
  }
}
