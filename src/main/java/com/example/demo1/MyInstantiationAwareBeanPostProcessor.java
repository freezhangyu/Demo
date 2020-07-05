package com.example.demo1;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("++++++++InstantiationAwareBeanPostProcessor+++postProcessBeforeInstantiation()");
		return null;
	}
	
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("++++++++InstantiationAwareBeanPostProcessor+++postProcessAfterInstantiation()");
		return true;
	}

	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName)
			throws BeansException {
		System.out.println("++++++++InstantiationAwareBeanPostProcessor+++postProcessProperties()");
		return null;
	}
	
	
	public PropertyValues postProcessPropertyValues(
			PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
		System.out.println("++++++++InstantiationAwareBeanPostProcessor+++postProcessPropertyValues()");
		return pvs;
	}
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("==========InstantiationAwareBeanPostProcessor=====postProcessBeforeInitialization");
		return bean;
	}
	
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("==========InstantiationAwareBeanPostProcessor=====postProcessAfterInitialization");
		return bean;
	}
	
	
	
}
