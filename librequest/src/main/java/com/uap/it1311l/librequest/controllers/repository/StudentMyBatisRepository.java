package com.uap.it1311l.librequest.controllers.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import models.LibRequestBody;

@Mapper
public interface StudentMyBatisRepository {
	@Insert("INSERT INTO library_requests.borrower_info(studentNo, studentName, noOfBooks) VALUES (#{studentNo}, #{studentName}, #{noOfBooks}")
	public int insert(LibRequestBody borrower);
}
