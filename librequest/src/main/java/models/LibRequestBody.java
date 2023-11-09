package models;

import java.util.ArrayList;

public class LibRequestBody {
	private String studentNo, studentName;
	private ArrayList<Book> books;
	private int noOfBooks;

	public LibRequestBody() {
		books = new ArrayList<>();
		noOfBooks = books.size();
	}
	
	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
	public ArrayList<Book> getBooks() {
		// arrange alphabetically
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = (ArrayList<Book>) books;
	}
	
	public String toString() {
		return studentNo + studentName + books.size();
	}

	public int getNoOfBooks() {
		return noOfBooks;
	}
}
