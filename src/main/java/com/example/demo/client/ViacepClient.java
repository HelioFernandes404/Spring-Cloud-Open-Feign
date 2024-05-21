package com.example.demo.client;

import com.example.demo.client.response.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws", name = "viacep")
public interface ViacepClient {


    @GetMapping("/{cep}/json/")
    Address getAddressByCep(@PathVariable("cep") String cep);
}
