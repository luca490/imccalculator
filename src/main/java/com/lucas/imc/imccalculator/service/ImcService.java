package com.lucas.imc.imccalculator.service;

import org.springframework.stereotype.Service;

@Service
public class ImcService {

    public double calcularImc(double peso, double altura) {
        if (altura == 0) throw new IllegalArgumentException("Altura não pode ser zero.");
        return peso / (altura * altura);
    }

    public String classificarImc(double imc) {
        if (imc < 18.5) return "Abaixo do peso";
        else if (imc < 24.9) return "Peso normal";
        else if (imc < 29.9) return "Sobrepeso";
        else return "Obesidade";
    }
}
