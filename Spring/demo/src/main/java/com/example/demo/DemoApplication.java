package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RequestMapping;



@SpringBootApplication
@RestController
public class DemoApplication extends SpringBootServletInitializer implements ApplicationRunner{

	@Value("${server.application.name:demoservice}")
	private String name;

	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder application){
		return application.sources(DemoApplication.class);
	}

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		ApplicationContext ctx = new AnnotationConfigApplicationContext(DemoApplication.class);
		UserService uService = (UserService)ctx.getBean("myBean");
		System.out.println("UserServie list : " + uService.getUserList());

	} 

	@RequestMapping(value = "/hello")
	public String CallName(){
		return "Hello My name is mony now we are from tomcat";
	}

	@RequestMapping(value = "/beanExample")
	public String CallUserService(){
		ApplicationContext ctx = new AnnotationConfigApplicationContext(DemoApplication.class);
		UserService uService = (UserService)ctx.getBean("myBean");
		return ("User List is : " + uService.getUserList());
	}

	@Override
	public void run(ApplicationArguments arg0) throws Exception{
		System.out.println("Hello from Application runner");
	}

	@RequestMapping("/")
	public String name(){
		return name;
	}
}
