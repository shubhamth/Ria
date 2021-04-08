package com.ria.services;

import java.util.List;

import com.ria.model.User;

public interface UserService {
	public User create(User user);

	public User delete(int id);

	public List findAll();

	public User findById(int id);
	public User findUserByUserName(String userName);

	public User update(User user);

}
