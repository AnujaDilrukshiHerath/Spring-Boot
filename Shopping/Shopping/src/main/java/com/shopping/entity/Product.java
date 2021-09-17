package com.shopping.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;


    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table
    public class Product {
        @Id
        @Column(name = "i_d", nullable = false)
        private Integer iD;
        private String name;

        private double price;

        private LocalDate expiryDate;


    }


