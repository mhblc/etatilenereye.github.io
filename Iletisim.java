package com.example.tatilrezervasyon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Iletisim {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String adSoyad;
    private String email;
    private String mesaj;

    // Getters ve Setters
}
