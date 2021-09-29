package com.google.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class has dummy test cases
 *
 * @author nirmala
 */
public class FirstTest {

    /**
     * This test case checks hello world text.
     */

    @Test
    public void verifyHelloWorld() {
        String actualText = "Hello World";
        String expectedText = "Hello World";

        Assert.assertEquals(actualText, expectedText, String.format("Expected is %s, but actual is %s", expectedText, actualText));
    }

    /**
     * This test checks addition process.
     */
    @Test
    public void verifyAddition() {
       int result = 10;
        int a = 4;
        int b = 3;
        int actualResult = a + b;
        Assert.assertEquals(actualResult, result, String.format("Expected is %s, but actual is %s", result, actualResult));
    }
}
