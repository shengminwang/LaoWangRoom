package com.newer.pojo;

/**
 * 房源类
 * 
 * @author Administrator
 * 
 */
public class Houselnfo {
	/**
	 * 房源类id
	 */
	private int id;
	/**
	 * 房东（FK）
	 */
	private int landlordid;
	/**
	 * 业务员（FK）
	 */
	private int usersid;
	/**
	 * 店铺（FK）
	 */
	private int storeid;
	/**
	 * 城区
	 */
	private String area;
	/**
	 * 小区
	 */
	private String territory;
	/**
	 * 地址
	 */
	private String address;
	/**
	 * 楼层（数据表示）
	 */
	private int floor;
	/**
	 * 户型
	 */
	private int housetype;
	/**
	 * 面积
	 */
	private int acreage;
	/**
	 * 装修类型（0未装修1普通装修2精装修3豪华装修）
	 */
	private String type;
	/**
	 * 价格
	 */
	private int price;
	/**
	 * 设施
	 */
	private String equipment;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 状态
	 */
	private String state;
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
	 * @return the landlordid
	 */
	public int getLandlordid() {
		return landlordid;
	}

	/**
	 * @param landlordid
	 *            the landlordid to set
	 */
	public void setLandlordid(int landlordid) {
		this.landlordid = landlordid;
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
	 * @return the storeid
	 */
	public int getStoreid() {
		return storeid;
	}

	/**
	 * @param storeid
	 *            the storeid to set
	 */
	public void setStoreid(int storeid) {
		this.storeid = storeid;
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
	 * @return the territory
	 */
	public String getTerritory() {
		return territory;
	}

	/**
	 * @param territory
	 *            the territory to set
	 */
	public void setTerritory(String territory) {
		this.territory = territory;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
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
	 * @return the acreage
	 */
	public int getAcreage() {
		return acreage;
	}

	/**
	 * @param acreage
	 *            the acreage to set
	 */
	public void setAcreage(int acreage) {
		this.acreage = acreage;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
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
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *            the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
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
