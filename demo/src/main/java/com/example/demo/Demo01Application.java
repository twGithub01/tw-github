package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*此注解指定这是一个SpringBoot的应用程序，不加就会报异常
Unable to start ServletWebServerApplicationContext 
due to missing ServletWebServerFactory bean
*/
@SpringBootApplication
public class Demo01Application {

	public static void main(String[] args) {
		//SpringApplication用于从main方法中启动Spring应用的类
		//启动方式一
		//SpringApplication.run(Demo01Application.class, args);
		
		//启动方式二
		 //禁止命令行设置参数
		SpringApplication springApplication = new SpringApplication(Demo01Application.class);
		springApplication.setAddCommandLineProperties(false);		
		springApplication.run(args);
	}
}
