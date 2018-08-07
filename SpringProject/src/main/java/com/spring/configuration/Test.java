package com.spring.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.spring.service.Fruit;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext  context =new AnnotationConfigApplicationContext(AppConfiguration.class);
		Fruit fruitName=(Fruit) context.getBean("fruit");
		System.out.println(fruitName.fruitType());

	}

}