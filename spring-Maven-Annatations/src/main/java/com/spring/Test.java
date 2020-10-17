package com.spring;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		String Paths[] = { "applicationContext.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(Paths);
		
		/*Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);*/
		
		//HelloBean helloBean = (HelloBean)context.getBean("helloBean");
		HelloBean helloBean = (HelloBean)context.getBean(HelloBean.class);
		helloBean.setMessage("Hello spring");
		System.out.println(helloBean);
	}

}
 