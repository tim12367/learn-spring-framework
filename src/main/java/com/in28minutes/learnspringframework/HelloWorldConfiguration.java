package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 標記為 Configuration Class
 */
@Configuration
public class HelloWorldConfiguration {
	
	/**
	 * 標記為Bean 可透過Context取得
	 */
	@Bean
	public String name() {
		return "Range";
	}
}
