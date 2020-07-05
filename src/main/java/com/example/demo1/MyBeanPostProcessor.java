package com.example.demo1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("++++++++BeanPostProcessor+++postProcessBeforeInitialization()");
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("++++++++BeanPostProcessor+++postProcessAfterInitialization()");
		return bean;
	}
}
