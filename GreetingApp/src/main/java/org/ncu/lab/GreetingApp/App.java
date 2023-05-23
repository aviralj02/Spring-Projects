package org.ncu.lab.GreetingApp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;

public class App 
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter your name: ");
    	String name = sc.next();
    	System.out.print("Enter language: ");
    	String lang = sc.next().toLowerCase();
 
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
    	GreetingService service = null;
    	
    	if (lang.equals("english")) {
    		service = context.getBean("engGreet", EnglishGreetingService.class);
    	}
    	else if(lang.equals("french")) {
    		service = context.getBean("freGreet", FrenchGreetingService.class);
    	}
    	else if(lang.equals("spanish")) {
    		service = context.getBean("spaGreet", SpanishGreetingService.class);
    	}
    	else {
    		System.out.println("Wrong language!");
    	}
    	
    	service.greet(name);
    	service.fortune(name);
    	service.workout(name);
        
        sc.close();
        context.close();
    }
}
