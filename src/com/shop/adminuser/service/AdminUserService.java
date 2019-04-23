package com.shop.adminuser.service;

import org.springframework.transaction.annotation.Transactional;

import com.shop.adminuser.dao.AdminUserDao;
import com.shop.adminuser.pojo.AdminUser;
@Transactional
public class AdminUserService {
	// 注入Dao
	private AdminUserDao adminUserDao;

	public void setAdminUserDao(AdminUserDao adminUserDao) {
		this.adminUserDao = adminUserDao;
	}

	
	public AdminUser login(AdminUser adminUser) {
		return adminUserDao.login(adminUser);
	}
	
}
