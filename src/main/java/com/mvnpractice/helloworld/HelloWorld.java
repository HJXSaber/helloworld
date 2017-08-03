package com.mvnpractice.helloworld;

import java.io.FileWriter;
import java.io.IOException;

import org.dom4j.*;
import org.dom4j.io.XMLWriter;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{
	private String str;
	
	public HelloWorld() 
	{
		str = "Hello World!";
	}
	
	public String getStr()
	{
		return str;
	}
	
	public void log() throws IOException
	{
		Document document = DocumentHelper.createDocument();
		document.addElement("helloworld");
		
		Element node = document.getRootElement();
		node.setText(str);
		
		XMLWriter writer = new XMLWriter(new  FileWriter("helloworld.xml"));  
	    writer.write(document);
	    writer.close();
	}
	
    public static void main( String[] args )
    {
        System.out.println( new HelloWorld().getStr() );
        
    }
}
