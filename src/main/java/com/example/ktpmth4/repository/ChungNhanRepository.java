package com.example.ktpmth4.repository;

import com.example.ktpmth4.entity.ChuyenBay;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChungNhanRepository extends CrudRepository<ChuyenBay, String> {
    @Query("select cb from ChuyenBay cb where cb.gaDen = 'DAD' ")
    List<ChuyenBay> findChuyenBayByGaDen(String gaDen);

}