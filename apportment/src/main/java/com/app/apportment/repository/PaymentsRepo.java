package com.app.apportment.repository;

import com.app.apportment.entity.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentsRepo extends JpaRepository<Payments, Long> {
}
