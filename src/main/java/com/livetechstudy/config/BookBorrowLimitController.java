package com.livetechstudy.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookBorrowLimitController {
	
	@GetMapping("/book-borrow-limit")
	public BookBorrowLimitConfiguration getLimit() {
		return new BookBorrowLimitConfiguration(10);
	}
}
