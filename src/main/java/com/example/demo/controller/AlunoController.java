package com.example.demo.controller;

import com.example.demo.entities.Aluno;
import com.example.demo.service.AlunoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoServices alunoServices;



}
