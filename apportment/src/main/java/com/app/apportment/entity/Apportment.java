package com.app.apportment.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "apportment")
@Data
public class Apportment {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String location;
    @Column
    private String address;
    @Column
    private String contactPersonName;
    @Column
    private String contactPersonMobile;
}
