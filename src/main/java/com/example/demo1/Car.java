package com.example.demo1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Car implements BeanFactoryAware,BeanNameAware,InitializingBean,DisposableBean{

	private String brand= "car";
	
	public Car() {
		System.out.println("---构造函数---Car()---------");
	}
	
	public void setBrand(String brand) {
		System.out.println("----设置属性--setBrand---");
		this.brand=brand;
	}
	
	
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}
	
//===================
	private BeanFactory beanFactory;
	
	private String beanName;
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory=beanFactory;
		
	}

	@Override
	public void setBeanName(String name) {
		this.beanName=name;
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("-----InitializingBean- afterPropertiesSet() -");
		
	}

	@Override
	public void destroy() throws Exception {
	
		System.out.println("-----DisposableBean- destroy()-");
	}

	
	public void myInit() {
		System.out.println("-----myInit()----");
	}
	
	public void myDestory() {
		System.out.println("-----myDestory()----");
	}
	
}
