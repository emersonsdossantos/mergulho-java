package com.algaworks.banco.app;

import com.algaworks.banco.modelo.Banco;
import com.algaworks.banco.modelo.Conta;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.stream.Stream;

public class Principal4 {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.getContas().stream()
            .filter(conta -> conta.getSaldo().compareTo(new BigDecimal("50")) > 0)
            .filter(conta -> conta.getNumero() > 200)
                .sorted(Comparator.comparingInt(Conta::getNumero))
            .forEach(conta -> {
                System.out.println(conta.getAgencia() + "/" + conta.getNumero() + " = " + conta.getSaldo());
        });
    }
}
