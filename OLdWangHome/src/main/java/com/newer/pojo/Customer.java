package com.newer.pojo;

/**
 * 客户类
 * 
 * @author Administrator
 * 
 */
public class Customer {
	/**
	 * 客户类id
	 */
	private int id;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 联系方式
	 */
	private String phone;
	/**
	 * 城区
	 */
	private String area;
	/**
	 * 意向户型
	 */
	private int housetype;
	/**
	 * 意向楼层（数据表示）
	 */
	private int floor;
	/**
	 * 价格
	 */
	private int price;
	/**
	 * 设施
	 */
	private String equipment;
	/**
	 * 状态 0没有目标房子 1有目标房子但未租 2已经出租
	 */
	private String state;
	/**
	 * 业务员（FK用户）
	 */
	private int usersid;
	/**
	 * 录入时间
	 */
	private String date;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area
	 *            the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the housetype
	 */
	public int getHousetype() {
		return housetype;
	}

	/**
	 * @param housetype
	 *            the housetype to set
	 */
	public void setHousetype(int housetype) {
		this.housetype = housetype;
	}

	/**
	 * @return the floor
	 */
	public int getFloor() {
		return floor;
	}

	/**
	 * @param floor
	 *            the floor to set
	 */
	public void setFloor(int floor) {
		this.floor = floor;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the equipment
	 */
	public String getEquipment() {
		return equipment;
	}

	/**
	 * @param equipment
	 *            the equipment to set
	 */
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the usersid
	 */
	public int getUsersid() {
		return usersid;
	}

	/**
	 * @param usersid
	 *            the usersid to set
	 */
	public void setUsersid(int usersid) {
		this.usersid = usersid;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

}
