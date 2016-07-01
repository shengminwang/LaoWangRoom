package com.newer.pojo;

/**
 * 收藏
 * 
 * @author Administrator
 * 
 */
public class Star {
	/**
	 * 收藏类id
	 */
	private int id;
	/**
	 * 业务员
	 */
	private int usersid;
	/**
	 * 房源
	 */
	private int houselnfoid;
	/**
	 * 收藏日期
	 */
	private String date;
	/**
	 * 状态 0收藏 1取消收藏
	 */
	private String state;

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
	 * @return the houselnfoid
	 */
	public int getHouselnfoid() {
		return houselnfoid;
	}

	/**
	 * @param houselnfoid
	 *            the houselnfoid to set
	 */
	public void setHouselnfoid(int houselnfoid) {
		this.houselnfoid = houselnfoid;
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

}
