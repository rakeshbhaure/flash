package com.spring.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.spring.service.Fruit;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		Fruit fruitName = (Fruit) context.getBean("fruit");
		Fruit fruitNametwo = (Fruit) context.getBean("banana");
		Fruit fruit = (Fruit) context.getBean("mango");
		Fruit fruitOrange = (Fruit) context.getBean("orange");
		System.out.println(fruitName.fruitType());
		System.out.println(fruitNametwo.fruitType());
		System.out.println(fruit.fruitType());
		System.out.println(fruitOrange.fruitType());
		context.close();

	}

}
