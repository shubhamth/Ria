package com.ria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ria.model.User;
import com.ria.repository.RoleRepository;
import com.ria.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserRepository repository;

	@Autowired
    private RoleRepository roleRepository;
    
     
    @Override
    public User create(User user) {
        return repository.save(user);
    }

    @Override
    public User delete(int id) {
        User user = findById(id);
        if(user != null){
            repository.delete(user);
        }
        return user;
    }

    @Override
    public List findAll() {
        return repository.findAll();
    }

    @Override
    public User findById(int id) {
        return repository.findById(id);
    }

    @Override
    public User update(User user) {
        return null;
    }

	@Override
	public User findUserByUserName(String userName) {
		return repository.findUserByUsername(userName);
	}
}
