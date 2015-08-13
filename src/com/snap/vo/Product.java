package com.snap.vo;

import java.util.Comparator;

public class Product implements Comparable<Product>{

	private int prodId;
	private String prodName;
	private double price;
	private String category;
	private String pimg;
	
	
	public String getPimg() {
		return pimg;
	}

	public void setPimg(String pimg) {
		this.pimg = pimg;
	}

	public Product(){
		
	}
	
	public Product(int prodId, String prodName, double price, String category) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.category = category;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String toString() {
		
		return prodId + " " + prodName + " " + price +" " + category;
	}
	
	
	public int compareTo(Product p) {
		if(this.prodId > p.prodId){
			return 1;
		}else if(this.prodId < p.prodId){
			return -1;
		}else{
			return 0;
		}
		
	}
	
	public static class PriceCompartor implements Comparator<Product>{

		
		public int compare(Product p1, Product p2) {
			if(p1.getPrice() > p2.getPrice()){
				return 1;
			}else if(p1.getPrice() < p2.getPrice()){
				return -1;
			}else{
				return 0;
			}
		}
		
	}
	
}













