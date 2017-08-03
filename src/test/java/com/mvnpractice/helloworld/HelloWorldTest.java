package com.mvnpractice.helloworld;

import java.io.IOException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class HelloWorldTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public HelloWorldTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( HelloWorldTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testHelloWorld()
	{
		HelloWorld helloWorld = new HelloWorld();
		assertEquals("Hello World!", helloWorld.getStr());
	}
    
    public void testLog()
	{
		HelloWorld helloWorld = new HelloWorld();
		try
		{
			helloWorld.log();
		} catch (IOException e)
		{
			e.printStackTrace();
			fail("log fail");
		}
	}
}
