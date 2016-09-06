package org.simple.spbo.shiro.service;

import org.simple.spbo.shiro.entity.UserInfo;


/**
 * 
 * @author GeL
 *
 */
public interface IUserInfoService {

	/**
	 * 根据用户名 获取用户信息
	 * @param userName
	 * @return
	 */
	UserInfo findByUsername(String userName);
	
}
