package com.example.ktpmth4.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "nhanvien")
public class NhanVien {
    @Id
    @GeneratedValue
    private long manv;


    private  String ten;

    private int luong;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.REFRESH)
    @JoinTable(name ="ChungNhan", joinColumns = {@JoinColumn(name = "maNV")}, inverseJoinColumns = {@JoinColumn(name = "maMB")})
    private Set<MayBay> listMayBay = new HashSet<>();




}
