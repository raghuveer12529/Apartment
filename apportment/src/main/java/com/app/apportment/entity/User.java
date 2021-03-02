package com.app.apportment.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long apportment_id;
    @Column
    private String user_name;
    @Column
    private String pass_word;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String role;

}
