package com.bw.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.mapper.BookMapper;
import com.bw.utils.IOUtils;

public class Test01 {

 public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	BookMapper mpper = ac.getBean(BookMapper.class);
	List<Object[]> list = IOUtils.readFile("a.txt", "\\|");
	for (Object[] objects : list) {
		Book book = new Book(Integer.parseInt(objects[0]+""), Double.parseDouble(objects[2]+""), objects[1]+"", objects[3]+"", null);
		System.out.println(objects[4]);
       	    
	}
}
}
