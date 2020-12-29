package com.model;

public class Magazine extends Book{
	private String magazineType;

	public Magazine(int iSBNNumber, String bookName, double price, String magazineType) {
		super(iSBNNumber, bookName, price);
		// TODO Auto-generated constructor stub
		this.magazineType=magazineType;
	}

	public String getMagazineType() {
		return magazineType;
	}

	public void setMagazineType(String magazineType) {
		this.magazineType = magazineType;
	}

	@Override
	public float calculateDiscount() {
		float discount=(float)((15*super.getPrice())/100);
		return discount;
	}
	

}
