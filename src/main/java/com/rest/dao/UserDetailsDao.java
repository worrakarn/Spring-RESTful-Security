package com.rest.dao;

import com.rest.entity.User;

public interface UserDetailsDao {
	User findUserByUsername(String username);
}
