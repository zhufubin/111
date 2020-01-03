package com.bw.mapper;

import org.apache.ibatis.annotations.Param;

import com.bw.test.Book;
import com.bw.test.Type;

public interface BookMapper {

	void addBook(Book book);

	Type queryTypeByName(@Param("name")String string);
	
}
