package com.lucas.imc.imccalculator.controller;

import com.lucas.imc.imccalculator.model.Pessoa;
import com.lucas.imc.imccalculator.service.ImcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/imc")
public class ImcController {

    @Autowired
    private ImcService imcService;

    @PostMapping
    public String calcular(@RequestBody Pessoa pessoa) {
        double imc = imcService.calcularImc(pessoa.getPeso(), pessoa.getAltura());
        String classificacao = imcService.classificarImc(imc);
        return String.format("IMC: %.2f - %s", imc, classificacao);
    }
}
