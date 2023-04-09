package com.a.anno;

import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args )
	    {
	    	ClassPathXmlApplicationContext context = 
					new ClassPathXmlApplicationContext("applicationcontext.xml");
	    	cricketcoach cc=context.getBean("cricketcoach",cricketcoach.class);
	    	System.out.println(cc.getCoach());
	    	System.out.println(cc.getFotune());
	    	System.out.println(cc.getEmail());
	    	
	    }
}
