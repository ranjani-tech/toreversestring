package com.howtodoinjava;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import com.howtodoinjava.ReverseMethod;

public class ReverseMethodTest extends TestCase
{
    public void testReverseMethod() {
        ReverseMethod reverseStringApp = new ReverseMethod();
        String reverseExpected = "olleh";
        String reverseActual = reverseStringApp.reverseString("hello");
        assertEquals(reverseExpected,reverseActual);
        System.out.println(reverseActual);

    }
}
