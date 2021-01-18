package com.nelioalves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nelioalves.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
