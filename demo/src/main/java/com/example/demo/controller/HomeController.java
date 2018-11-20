package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.conf.Person;

/**
 * @author sam
 * @since 2017/7/16
 */
//@RestController
//RestController = Controller + ResponseBody.加上RestController,
//返回的内容是你return中的内容,而不是你modelMap里面的内容
@Controller
@RequestMapping(value="/home")
public class HomeController {
	//访问路径 http://localhost:8888/home/test
	 @RequestMapping("/test")
	 public String home(ModelMap modelMap) { 
		 modelMap.put("name", "Magical Sam"); 
		 List<String> list = new ArrayList<String>(); 
		 list.add("sam a"); 
		 list.add("sam b"); 
		 list.add("sam c"); 
		 list.add("sam d"); 
		 modelMap.put("list", list); 
		 return "home"; //此处对应前端页面home.html或者home.ftl
	}
	 
	 @Autowired
	 private PersonRepository personRepository;
	 
	 @RequestMapping(value="/person",method = RequestMethod.GET)
	 public Person index() {
		 Person person = new Person(); 
		 person.setName("sam"); 
		 person.setAge("22"); 
		 //保存person 
		 personRepository.save(person); 
		 // Person temp = personRepository.findPerson(1l); 
		 Person temp = personRepository.findByName("sam"); 
		 
		 return temp;
		
	 }
}
