package org.simple.spbo.shiro.dao;

import org.simple.spbo.shiro.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * 
 * @author GeL
 *
 */
public interface IUserInfoRepository extends CrudRepository<UserInfo, Long> {

	/**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
