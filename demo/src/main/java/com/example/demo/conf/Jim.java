package com.example.demo.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//第二种：使用@ConfigurationProperties(prefix=”“) 设置前缀，
//属性上不需要添加注解。
@Component
@ConfigurationProperties(prefix = "com.sam")
public class Jim {
	private String name;

    private int age;

    private String desc;

  //getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

    
    
}
