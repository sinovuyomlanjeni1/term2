package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


import static org.junit.jupiter.api.Assertions.*;
/*
    Author: Akhona Mngqibisa (217302394)
    Date: 28 March 2021
    EmployeeTest.java
 */
class EmployeeTest
{
    private Employee emp1;
    private Employee emp2;
    private Employee emp3;

    @BeforeEach
    void setUp()
    {
       emp1 = new Employee();
       emp2 = new Employee();
       emp3 = new Employee();
    }

    @Test
    void testEquality()
    {

        assertEquals(emp1, emp2);
    }
    @Test
    void testEquality2()
    {
        emp1.setSalary(45);
        emp2.setSalary(50);
        assertEquals(emp1.getSalary(), emp2.getSalary());
    }

    @Test
    void testIdentity()
    {
      assertSame(emp1, emp2);
    }

    @Test
    void testFail()
    {
        if(emp1== null)
        fail("This test has failed");
    }

    @Test
   public void testGetName()
    {
       emp1.setFullName("Akhona Mngqibisa");
        String results = emp1.getFullName();
        String expectetResults = "Akhona Mngqibisa";
        assertEquals(expectetResults,results);
    }

    @Test
    @Timeout(200)
    public void testWithTimeout()
    {
        System.out.println("Calculating salary");
        emp1.getSalary();
    }

    @Test
    @Disabled("Until emp1 salary equals to emp2 salary")
    public void testDisable()
    {
        assertEquals(emp1.getSalary(), emp2.getSalary());
    }

}