package com.app.apportment.repository;

import com.app.apportment.entity.Apportment;
import com.app.apportment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
