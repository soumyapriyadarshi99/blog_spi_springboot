package com.soumya.blogging.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.soumya.blogging.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	

}
