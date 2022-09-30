package com.example.ktpmth4.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table(name ="chuyenbay")
public class ChuyenBay {


    @Id
    @Column(name = "macb")
    @GeneratedValue
    private String macb;

    private String gaDi;
    private String gaDen;
    private int doDai;
    @CreatedDate
    private Date gioDen;

    @CreatedDate
    private Date gioDi;

    private int chiPhi;
}
