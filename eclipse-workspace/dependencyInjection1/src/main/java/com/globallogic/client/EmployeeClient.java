package com.globallogic.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.globallogic.dao.EmployeeDao;

public class EmployeeClient {

	public static void main(String[] args) {
		Resource resource =new ClassPathResource("objects.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		EmployeeDao employeeDao =(EmployeeDao) factory.getBean("employeeDao");
		employeeDao.insertData();
		
	}
}
