package com.juaracoding;

import org.testng.annotations.*;

public class ProcedureTest {

    @BeforeClass
    public void setUp(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @Test(priority = 1, enabled = false)
    public void testOne(){
        System.out.println("Test Satu");
    }

    @Test(priority = 2)
    public void testTwo(){
        System.out.println("Test Dua");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

    @AfterClass
    public void finish(){
        System.out.println("After Class");
    }

}
