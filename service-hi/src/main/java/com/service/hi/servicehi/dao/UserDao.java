package com.service.hi.servicehi.dao;

import com.service.hi.servicehi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
