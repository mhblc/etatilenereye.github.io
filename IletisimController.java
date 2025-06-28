package com.example.tatilrezervasyon.controller;

import com.example.tatilrezervasyon.model.Iletisim;
import com.example.tatilrezervasyon.service.IletisimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/iletisim")
public
