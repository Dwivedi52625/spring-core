package com.firstQuestion;

//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class Test {
	public static void main( String[] args ) throws ClassCastException
    {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Customer c= (Customer)context.getBean("customer");
	    c.display();
	    Address d=c.getCustomerAddress();
	    d.addisplay();
    }
}