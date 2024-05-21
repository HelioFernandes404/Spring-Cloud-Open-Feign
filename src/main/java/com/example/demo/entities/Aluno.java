package com.example.demo.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cep;

    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;


}
