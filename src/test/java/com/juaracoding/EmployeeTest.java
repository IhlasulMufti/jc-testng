package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmployeeTest {

    Employee employee;

    @BeforeClass
    public void setUp(){
        employee = new Employee();
    }

    @Test
    public void testGetName(){
        employee.setName("John");
        Assert.assertEquals(employee.getName(), "John");
    }

    @Test
    public void testGetAddress(){
        employee.setAddress("Makassar");
        Assert.assertEquals(employee.getAddress(), "Makassar");
    }

    @Test
    public void testGetIsActive(){
        employee.setActive(true);
        Assert.assertTrue(employee.isActive());
    }

    @Test
    public void testGetSalary(){
        employee.setSalary(50000.0);
        Assert.assertEquals(employee.getSalary(), 50000.0);
    }

    // Negative test salary, exception
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testExceptionSalary(){
        employee.setSalary(-1.0);
    }
}
