package com.example.demo.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//第一种：使用spring支持的@Value()加载
@Component 
public class Sam { 
	//获取application.properties的属性 
	@Value("${com.sam.name}") 
	private String name; 	
	@Value("${com.sam.age}") 
	private int age; 
	@Value("${com.sam.desc}") 
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

