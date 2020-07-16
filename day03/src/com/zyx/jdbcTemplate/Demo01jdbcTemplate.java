package com.zyx.jdbcTemplate;

import java.util.List;

import com.zyx.bean.User;
import com.zyx.dao.UserDao;
import com.zyx.dao.UserDaoImpl;

public class Demo01jdbcTemplate {
	public static void main(String[] args) {
		UserDao ud =new UserDaoImpl();
		List<User>list=ud.findAllUser();
		for (User user : list) {
			System.out.println(user);
		}
	}
}
