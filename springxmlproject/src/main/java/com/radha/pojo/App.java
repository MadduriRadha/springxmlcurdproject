package com.radha.pojo;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Resource resource=new ClassPathResource("spring.xml");  
//	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
//	    Address add=(Address) factory.getBean("address");  
//	    System.out.println(add);
ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
Address add=(Address)context.getBean("address");
System.out.println(add);
}

}
