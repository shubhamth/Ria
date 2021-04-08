package com.ria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ria.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	List findAll();

    User findById(int id);

    User save(User user);

	User findUserByUsername(String userName);	
}
