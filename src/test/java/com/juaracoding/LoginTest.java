package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    Login login;

    @BeforeClass
    public void setUp(){
        login = new Login();
    }

    // positive test
    @Test(priority = 1)
    public void testLogin(){
        String actual = login.loginCheck("admin", "P4ssw0rd");
        String expected = "Login berhasil";
        Assert.assertEquals(actual, expected);
    }

    @Test(priority = 4)
    public void testShowLogo(){
        Assert.assertTrue(login.showLogo("C:\\Pictures\\image.png"));
    }

    @Test(priority = 5)
    public void testForgetPassword(){
        String actual = login.forgotPassword("admin", "12345","12345");
        String expected = "Password berhasil diubah";
        Assert.assertEquals(actual, expected);
    }

    // negative test
    @Test(priority = 2)
    public void testFalseUsername(){
        String actual = login.loginCheck("Admin", "P4ssw0rd");
        String expected = "Invalid login";
        Assert.assertEquals(actual, expected);
    }

    @Test(priority = 3)
    public void testFalsePassword(){
        String actual = login.loginCheck("admin", "Password");
        String expected = "Invalid login";
        Assert.assertEquals(actual, expected);
    }

    @Test(priority = 6)
    public void testUnknownUsername(){
        String actual = login.forgotPassword("John", "12345","12345");
        String expected = "Username tidak terdaftar";
        Assert.assertEquals(actual, expected);
    }

    @Test(priority = 7)
    public void testDifferentPassword(){
        String actual = login.forgotPassword("admin", "12345","56789");
        String expected = "Password tidak sama";
        Assert.assertEquals(actual, expected);
    }
}
