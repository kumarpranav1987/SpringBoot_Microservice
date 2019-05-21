package com.livetechstudy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookBorrowLimitController {
	
	@Autowired
	private Configuration conf;
	@GetMapping("/book-borrow-limit")
	
	public BookBorrowLimitConfiguration getLimit() {
		return new BookBorrowLimitConfiguration(conf.getMax());
	}
}
