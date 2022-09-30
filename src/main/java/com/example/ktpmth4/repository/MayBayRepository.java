package com.example.ktpmth4.repository;

import com.example.ktpmth4.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MayBayRepository extends JpaRepository<NhanVien, String> {
}