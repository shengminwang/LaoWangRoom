package com.newer.pojo;

/**
 * 图片
 * 
 * @author Administrator
 * 
 */
public class Picture {
	/**
	 * 图片id
	 */
	private int id;
	/**
	 * 图片地址
	 */
	private String src;
	/**
	 * 房源
	 */
	private String area;

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
	 * @return the src
	 */
	public String getSrc() {
		return src;
	}

	/**
	 * @param src
	 *            the src to set
	 */
	public void setSrc(String src) {
		this.src = src;
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

}
