package com.face.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class helloWorld1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("Resource/hlo.xml");
		
		
		
		HelloWorld h = (HelloWorld) beanFactory.getBean("Spring3HelloWorldBean");
		h.helloWorld();
	} 

}
