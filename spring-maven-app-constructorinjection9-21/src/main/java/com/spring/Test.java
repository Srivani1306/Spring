package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(context);
		
		Object obj = context.getBean("hbean") ;
		HelloBean bean = (HelloBean) obj;
		System.out.println(bean);
		bean.printMessage();
	}

}
