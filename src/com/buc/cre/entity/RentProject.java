package com.buc.cre.entity;

import java.util.ArrayList;

public class RentProject {
	private ObjectId _id;
	private Datetime create_time;
	private boolean is_approved;
	private boolean is_sell;
	private String pictures;
	private String brochure;
	private String project_name;
	private int project_type;
	private String position;
	private String address;
	private String contacter;
	private String phone;
	private ArrayList<Shop> shops_info;
	private ArrayList<Integer> shops_price;
	private ArrayList<Integer> shops_area;
	private ArrayList<String> shops_investment;

	public String get_id() {
		return _id.getObjectId();
	}

	public void set_id(String _id) {
		this._id.setObjectId(_id);
	}

	public long getCreate_time() {
		return create_time.getDatatime();
	}

	public void setCreate_time(String create_time) {
		this.create_time.setDatatime(create_time);
	}

	public boolean isIs_approved() {
		return is_approved;
	}

	public void setIs_approved(boolean is_approved) {
		this.is_approved = is_approved;
	}

	public boolean isIs_sell() {
		return is_sell;
	}

	public void setIs_sell(boolean is_sell) {
		this.is_sell = is_sell;
	}

	public String getPictures() {
		return pictures;
	}

	public void setPictures(String pictures) {
		this.pictures = pictures;
	}

	public String getBrochure() {
		return brochure;
	}

	public void setBrochure(String brochure) {
		this.brochure = brochure;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public int getProject_type() {
		return project_type;
	}

	public void setProject_type(int project_type) {
		this.project_type = project_type;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContacter() {
		return contacter;
	}

	public void setContacter(String contacter) {
		this.contacter = contacter;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public ArrayList<Shop> getShops_info() {
		return shops_info;
	}

	public void setShops_info(ArrayList<Shop> shops_info) {
		this.shops_info = shops_info;
	}

	public ArrayList<Integer> getShops_price() {
		return shops_price;
	}

	public void setShops_price(ArrayList<Integer> shops_price) {
		this.shops_price = shops_price;
	}

	public ArrayList<Integer> getShops_area() {
		return shops_area;
	}

	public void setShops_area(ArrayList<Integer> shops_area) {
		this.shops_area = shops_area;
	}

	public ArrayList<String> getShops_investment() {
		return shops_investment;
	}

	public void setShops_investment(ArrayList<String> shops_investment) {
		this.shops_investment = shops_investment;
	}

}
