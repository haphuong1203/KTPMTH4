package com.example.ktpmth4.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "maybay")

public class MayBay {
    @Id
    @GeneratedValue
    private int maMB;

    private String loai;


    private int tamBay;



}
