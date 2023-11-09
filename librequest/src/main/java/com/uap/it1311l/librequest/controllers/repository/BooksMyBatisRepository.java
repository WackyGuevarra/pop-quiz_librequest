package com.uap.it1311l.librequest.controllers.repository;

import java.awt.print.Book;
import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BooksMyBatisRepository {

	@Select("SELECT * FROM library_requests.borrowed_books WHERE bookCode = 'F' " )
	public ArrayList<Book> findBooksF();
	
	@Select("SELECT * FROM library_requests.borrowed_books WHERE bookCode = 'NF' " )
	public ArrayList<Book> findBooksNF();
}
