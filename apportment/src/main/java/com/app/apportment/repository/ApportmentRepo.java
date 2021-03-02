package com.app.apportment.repository;

import com.app.apportment.entity.Apportment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApportmentRepo extends JpaRepository<Apportment, Long> {
}
