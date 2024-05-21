package com.example.demo.controller;


import com.example.demo.client.response.Address;
import com.example.demo.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clienteviacep")
public class ViacepController {

    @Autowired
    private CepService viacepServices;

    @GetMapping("/cep/{cep}")
    public Address getAddressByCep(@PathVariable String cep) {
        return viacepServices.getAddress(cep);
    }

}
