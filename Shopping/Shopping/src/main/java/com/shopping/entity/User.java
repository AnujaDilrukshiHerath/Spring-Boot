package com.shopping.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class User {
    @Id
    @Column(name = "i_d", nullable = false)
    private Integer iD;
    private String name;
    private String phoneNumber;
}

