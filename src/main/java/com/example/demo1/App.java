package com.example.demo1;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("/beans.xml");
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(resource);
		
		beanFactory.addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());
		beanFactory.addBeanPostProcessor(new MyBeanPostProcessor());
		beanFactory.addBeanPostProcessor(new MyMergedBeanDefinitionPostProcessor());
		
		
		Object car = beanFactory.getBean("car");
		beanFactory.destroySingletons();
		System.out.println(car);
	}
}
