package com.cjzheng.maven.service;

import java.util.List;
import com.cjzheng.maven.entity.UserInfo;

/**
 * 
 * @Description: TODO
 * @author: zhengchaojie
 * @date 2017年3月8日 上午9:45:05
 *
 */

public interface UserInfoService {
	UserInfo load(Integer id);

	UserInfo get(Integer id);

	List<UserInfo> findAll();

	void persist(UserInfo entity);

	Integer save(UserInfo entity);

	void saveOrUpdate(UserInfo entity);

	void delete(Integer id);

	void flush();
}