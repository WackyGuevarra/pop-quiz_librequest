package com.uap.it1311l.librequest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uap.it1311l.librequest.controllers.repository.BooksMyBatisRepository;
import com.uap.it1311l.librequest.controllers.repository.StudentMyBatisRepository;

import models.LibRequestBody;

@RestController
public class RequestController {

	@Autowired
	StudentMyBatisRepository studentRepo;
	
	@Autowired
	BooksMyBatisRepository bookRepo;
	
	@PostMapping("/event/borrow")
	public String getBorrowInfo(@RequestBody LibRequestBody request) {
		studentRepo.insert(request);
		return request.toString();
	}
	
	@GetMapping("/event/books/{typeCode}")
	public String getBooks(@PathVariable String typeCode){
		bookRepo.findBooksF();
		bookRepo.findBooksNF();
		return typeCode;
	}
	
}
