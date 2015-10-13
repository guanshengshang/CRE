package com.buc.cre.entity;

public class StoreItemDevelop {
	private int StoreType;
	private String projrectName;
	private String address;
	private int price;
	private int area;
	private String investObject;
	private boolean isPublished;
	
	public boolean isPublished() {
		return isPublished;
	}

	public void setPublished(boolean isPublished) {
		this.isPublished = isPublished;
	}

	public int getStoreType() {
		return StoreType;
	}

	public void setStoreType(int storeType) {
		StoreType = storeType;
	}

	public String getProjrectName() {
		return projrectName;
	}

	public void setProjrectName(String projrectName) {
		this.projrectName = projrectName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getInvestObject() {
		return investObject;
	}

	public void setInvestObject(String investObject) {
		this.investObject = investObject;
	}

}
