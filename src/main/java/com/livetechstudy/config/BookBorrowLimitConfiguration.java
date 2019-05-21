package com.livetechstudy.config;

public class BookBorrowLimitConfiguration {
	private int max;

	
	public BookBorrowLimitConfiguration(int max) {
		this.max = max;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
}
