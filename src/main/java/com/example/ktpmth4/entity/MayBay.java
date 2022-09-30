package com.example.ktpmth4.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name ="maybay")
public class MayBay {
    @Id
    @Column(name = "mamb")
    @GeneratedValue
    private Long mamb;

    private String loai;

    private int tambay;
    @ManyToMany
    @JoinTable(name = "chungnhan",joinColumns = {@JoinColumn(name = "mamb")}, inverseJoinColumns = {@JoinColumn(name = "manv")})
    private List<NhanVien> listNhanVien;

}
