package com.taimakweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taimakweb.course.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
