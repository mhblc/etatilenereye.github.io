package com.example.tatilrezervasyon.controller;

import com.example.tatilrezervasyon.model.Odeme;
import com.example.tatilrezervasyon.service.OdemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/odeme")
public class OdemeController {
    

}

    @Autowired
    private OdemeService service;

    @GetMapping
    public List<Odeme> getAll() 
    {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Odeme getById(@PathVariable Long id) {
        return service.getById(id);
    }
    
}

    @PostMapping
    public Odeme save(@RequestBody Odeme odeme) {
    

        return service.save(odeme);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
