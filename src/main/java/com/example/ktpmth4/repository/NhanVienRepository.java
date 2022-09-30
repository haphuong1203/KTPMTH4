package com.example.ktpmth4.repository;


import com.example.ktpmth4.entity.NhanVien;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienRepository extends CrudRepository <NhanVien, Long> {
    List<NhanVien> findNhanVienByTen(String ten);




}
