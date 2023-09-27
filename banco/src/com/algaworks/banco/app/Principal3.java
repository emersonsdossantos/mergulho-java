package com.algaworks.banco.app;

import com.algaworks.banco.modelo.Banco;
import com.algaworks.banco.modelo.Conta;

public class Principal3 {

    public static void main(String[] args) {
        Banco banco = new Banco();

        for (Conta conta : banco.getContas()){
            System.out.println(conta.getAgencia() + "/" + conta.getNumero());
        }
    }
}
