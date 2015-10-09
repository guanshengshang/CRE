package com.buc.cre.entity;

public class WantedShop {
	private ObjectId _id;
	private Datetime create_time;
	private boolean is_approved;
	private boolean is_buy;
	private int wanter_type;
	private int intention_type;
	private int business_type;
	private String brand_name;
	private int area;
	private int intention_price;
	private String project_demand;
	private String contacter;
	private String phone;

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

	public boolean isIs_buy() {
		return is_buy;
	}

	public void setIs_buy(boolean is_buy) {
		this.is_buy = is_buy;
	}

	public int getWanter_type() {
		return wanter_type;
	}

	public void setWanter_type(int wanter_type) {
		this.wanter_type = wanter_type;
	}

	public int getIntention_type() {
		return intention_type;
	}

	public void setIntention_type(int intention_type) {
		this.intention_type = intention_type;
	}

	public int getBusiness_type() {
		return business_type;
	}

	public void setBusiness_type(int business_type) {
		this.business_type = business_type;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getIntention_price() {
		return intention_price;
	}

	public void setIntention_price(int intention_price) {
		this.intention_price = intention_price;
	}

	public String getProject_demand() {
		return project_demand;
	}

	public void setProject_demand(String project_demand) {
		this.project_demand = project_demand;
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

}
