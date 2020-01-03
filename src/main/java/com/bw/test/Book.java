package com.bw.test;

public class Book {
	private Integer bid;
	private Double price;
	private String bname;
	private String btime;
	private Integer tid;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Integer bid, Double price, String bname, String btime, Integer tid) {
		super();
		this.bid = bid;
		this.price = price;
		this.bname = bname;
		this.btime = btime;
		this.tid = tid;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBtime() {
		return btime;
	}
	public void setBtime(String btime) {
		this.btime = btime;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", price=" + price + ", bname=" + bname + ", btime=" + btime + ", tid=" + tid + "]";
	}
	
}
