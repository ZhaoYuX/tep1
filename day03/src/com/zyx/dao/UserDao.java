package com.zyx.dao;

import java.util.List;

import com.zyx.bean.*;
public interface UserDao {
	List<User> findAllUser();
}