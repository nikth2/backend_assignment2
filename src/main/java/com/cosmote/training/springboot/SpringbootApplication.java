package com.cosmote.training.springboot;

import com.cosmote.training.springboot.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		User user = (User) ctx.getBean("user");
	}

}
