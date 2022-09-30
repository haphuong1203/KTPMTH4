package com.example.ktpmth4.repository;

import com.example.ktpmth4.entity.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
}
