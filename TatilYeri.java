package com.example.tatilrezervasyon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TatilYeri {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String isim;
    private String aciklama;

    // Getters ve Setters
}
