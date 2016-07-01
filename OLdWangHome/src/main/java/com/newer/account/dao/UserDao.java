package com.newer.account.dao;
/**
 * UserMapper数据访问对象接口类 
 * @author Administrator
 *
 */
public interface UserDao{
	/**
	 * 
	 * @param name
	 * @param password
	 * @return int 账户等级分别进行不同的操作
	 */
	public int login(String name,String password);
}
