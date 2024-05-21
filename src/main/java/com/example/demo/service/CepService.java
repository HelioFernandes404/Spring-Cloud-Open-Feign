package com.example.demo.service;


import com.example.demo.client.ViacepClient;
import com.example.demo.client.response.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CepService {

    @Autowired
    private ViacepClient viaCepClient;

    public Address getAddress(String cep) {
        if (!isValidCep(cep)) {
            throw new IllegalArgumentException("CEP inválido");
        }
        return viaCepClient.getAddressByCep(cep);
    }

    private boolean isValidCep(String cep) {
        return cep != null && cep.matches("\\d{8}");
    }


}
