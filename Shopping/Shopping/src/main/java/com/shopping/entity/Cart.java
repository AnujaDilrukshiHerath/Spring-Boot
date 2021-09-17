package com.shopping.entity;

import lombok.*;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "i_d")
    private Integer iD;


    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private User user;

    @Transient
    private Double total;

    @OneToMany
    private List<item> itemList;

    public void saveAll( Cart cart){
        if (itemList==null){
            itemList = new ArrayList<>();

        }
        if(itemList.contains(cart)){
            itemList.add(cart);
        }
    }




}
