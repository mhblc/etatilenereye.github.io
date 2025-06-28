package com.example.tatilrezervasyon.service;

import com.example.tatilrezervasyon.model.TatilYeri;
import com.example.tatilrezervasyon.repository.TatilYeriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TatilYeriService {
    @Autowired
    private TatilYeriRepository repository;

    public List<TatilYeri> getAll() {
        return repository.findAll();
    }

    public TatilYeri getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public TatilYeri save(TatilYeri tatilYeri) {
        return repository.save(tatilYeri);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
