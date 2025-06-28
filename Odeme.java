package com.example.tatilrezervasyon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Odeme {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String adSoyad;
    private String kartNumarasi;
    private String sonKullanmaTarihi;
    private String cvv;
    private double amount;

    // Getters ve Setters
}
