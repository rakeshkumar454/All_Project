package com.globallogic.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.globallogic.service.Restraunt;

public class RestrauntClient {

	public static void main(String[] args) {
		Resource resource= new ClassPathResource("objects.xml");
		
		//IOC
		BeanFactory factory = new XmlBeanFactory(resource);
		Restraunt restraunt=(Restraunt) factory.getBean("res");
	}
}
