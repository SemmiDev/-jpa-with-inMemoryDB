package com.sammidev.belajar.h2.repository;

import com.sammidev.belajar.h2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
