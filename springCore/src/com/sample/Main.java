package com.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	@SuppressWarnings("resource")

	public static void main(String[] args) {

		//load xml file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringCore.xml");
		
		Student stu1 = (Student)context.getBean("s2");
		System.out.println(stu1.getId());
		System.out.println(stu1.getName());


	}

}
