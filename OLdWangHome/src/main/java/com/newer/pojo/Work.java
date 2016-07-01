package com.newer.pojo;

/**
 * 看房记录
 * 
 * @author Administrator
 * 
 */
public class Work {
	/**
	 * 看房记录id
	 */
	private int id;
	/**
	 * 业务员（FK用户）
	 */
	private int usersid;
	/**
	 * 客户（FK客户）
	 */
	private int customerid;
	/**
	 * 房源（FK房源）
	 */
	private int houselnfoid;
	/**
	 * 时间
	 */
	private String date;
	/**
	 * 结果 0无意 1有意但未成交 2成交
	 */
	private String result;
	/**
	 * 备注
	 */
	private String remark;

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
	 * @return the customerid
	 */
	public int getCustomerid() {
		return customerid;
	}

	/**
	 * @param customerid
	 *            the customerid to set
	 */
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
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
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(String result) {
		this.result = result;
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

}
