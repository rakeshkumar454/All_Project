package com.globallogic.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.globallogic.config.AppConfig;
import com.globallogic.dao.EmployeeDao;

public class EmployeeClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

	    EmployeeDao empDao = applicationContext.getBean(EmployeeDao.class);

	    empDao.insertData();

	    applicationContext.close();
		
	}
}
