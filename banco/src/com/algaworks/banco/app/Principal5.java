package com.algaworks.banco.app;

import com.algaworks.banco.modelo.Banco;
import com.algaworks.banco.modelo.Conta;

import java.util.Optional;

public class Principal5 {

    public static void main(String[] args) {
        Banco banco = new Banco();

        Optional<Conta> contaOptional =  banco.buscar(123, 333);

        if (contaOptional.isPresent()){
            Conta contaEncontrada = contaOptional.get();
            System.out.println(contaEncontrada.getSaldo());
        }
    }
}
