package com.example.ECommerce.Model;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id")

    private int id;
    private String name;


}
