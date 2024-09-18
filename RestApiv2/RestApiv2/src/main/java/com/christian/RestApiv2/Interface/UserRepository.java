package com.christian.RestApiv2.Interface;

import com.christian.RestApiv2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Integer> {
}
