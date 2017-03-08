package com.cjzheng.maven.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cjzheng.maven.dao.UserInfoDao;
import com.cjzheng.maven.entity.UserInfo;
import com.cjzheng.maven.service.UserInfoService;

/**
 * 
 * @Description: TODO
 * @author: zhengchaojie
 * @date 2017年3月8日 上午9:48:07
 *
 */

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoDao userInfoDao;

	@Override
	public UserInfo load(Integer id) {
		return null;
	}

	@Override
	public UserInfo get(Integer id) {
		return userInfoDao.get(id);
	}

	@Override
	public List<UserInfo> findAll() {
		return userInfoDao.findAll();
	}

	@Override
	public void persist(UserInfo entity) {
		userInfoDao.persist(entity);
	}

	@Override
	public Integer save(UserInfo entity) {
		return userInfoDao.save(entity);
	}

	@Override
	public void saveOrUpdate(UserInfo entity) {
		userInfoDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		userInfoDao.delete(id);
	}

	@Override
	public void flush() {
		userInfoDao.flush();
	}

}