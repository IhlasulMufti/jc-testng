package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MessageErrorTest {

    MessageError messageError;

    @BeforeClass
    public void setUp(){
        messageError = new MessageError();
    }

    @Test
    public void testTxtMessage(){
        boolean actual = messageError.textMessage("Invalid credentials");
        Assert.assertTrue(actual);
    }
}
