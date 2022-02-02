package com.dio.gof.model.service;

import com.dio.gof.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "viacep", url = "https://viacep.com.ne/ws")
public interface ViaCepService {
    @RequestMapping(
            method = {RequestMethod.GET},
            value = {"/{cep}/json"}
    )
    Endereco consultarCep(@PathVariable("cep") String cep);
}
