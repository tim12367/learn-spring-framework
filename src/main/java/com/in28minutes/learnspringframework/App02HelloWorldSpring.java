package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// 1. new 一個 Spring context 建構時傳入 Configuration class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		// 2. 設定需要被Spring框架 管理的東西 使用 @Configuration (HelloWorldConfiguration內)
		// 2.1 使用@Bean標記需要被管理的Bean (HelloWorldConfiguration內)
		
		// 3. 使用context取得名稱叫做name的Bean
		System.out.println(context.getBean("name"));
	}

}
