package org.simple.spbo.shiro.service;

import org.simple.spbo.shiro.dao.IUserInfoRepository;
import org.simple.spbo.shiro.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户信息实现类
 * @author GeL
 *
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {

	@Autowired
	private IUserInfoRepository infoRepository;
	
	@Override
	public UserInfo findByUsername(String userName) {
		System.out.println("UserInfoServiceImpl.findByUsername()");
		return infoRepository.findByUsername(userName);
	}

}
