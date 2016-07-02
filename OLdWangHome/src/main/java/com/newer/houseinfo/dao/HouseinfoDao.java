package com.newer.houseinfo.dao;

public interface HouseinfoDao {
	/** 这个方法是用来录入房东的 */
	public void Newlandlord(int id, String name, String phone);

	/** 这个方法是用来录入房源的 */
	public void NewHouseinfoDao(int id, int landlord_id, int users_id, int store_id, String area, String territory,
			String address, int floor, int house_type, int acreage, int type, int price, String equipment,
			String remark, String state, String date);
}
