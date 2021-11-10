package com.vstavit_nazvanie.readlia;

import java.util.HashMap;

public class UserBook extends Book {
	private int pageCount;
	private int pageNumber;
	private int progressRead;
	private HashMap<Integer, String> citate;

	/*
	public UserBook() {
		super();
	}


	public UserBook(int id, int image, HashMap<Integer, Autor> autorhash, HashMap<Integer, Genre> ganrehash,
					String title, int pageCount, int pageCount2, int pageNumber, int progressRead,
					HashMap<Integer, String> citate) {
		super(id, image, autorhash, ganrehash, title, pageCount);
		pageCount = pageCount2;
		this.pageNumber = pageNumber;
		this.progressRead = progressRead;
		this.citate = citate;
	}
	*/

	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getProgressRead() {
		return progressRead;
	}
	public void setProgressRead(int progressRead) {
		this.progressRead = progressRead;
	}
	public HashMap<Integer, String> getCitate() {
		return citate;
	}
	public void setCitate(HashMap<Integer, String> citate) {
		this.citate = citate;
	}
	
}
