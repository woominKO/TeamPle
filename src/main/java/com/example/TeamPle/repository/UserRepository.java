package com.example.TeamPle.repository;

import com.example.TeamPle.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}