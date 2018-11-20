package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.conf.Sam;

/*项目如果新建controller类需要新建在这个Demo01Application主函数类
 * 同级目录或之下目录,否则找不到页面 404
*/
//RestController相当于SpringMVC中的 @Controller + @ResponseBody
@RestController
public class IndexController {
	
	@Autowired
    private Sam sam; //自动注入实体类
	
	//访问路径 http://localhost:8888/index
	@RequestMapping("/index")
    public String index() {
        return "hello world!hello China!";
    }
	
	//访问路径 http://localhost:8888/sam
	@RequestMapping("/sam")
    public String sam() {
		System.out.println(sam.getName() + " " + sam.getAge() + " " + sam.getDesc());
        return "aaa";
    }
}
