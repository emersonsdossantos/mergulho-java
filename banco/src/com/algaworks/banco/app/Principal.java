package com.algaworks.banco.app;

import com.algaworks.banco.modelo.Conta;
import com.algaworks.banco.modelo.ContaEspecial;
import com.algaworks.banco.modelo.ContaInvestimento;
import com.algaworks.banco.modelo.Pessoa;

public class Principal {

    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("Emerson Santos");
        titular1.setDocumento("12346886");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Agatha Ramires");
        titular2.setDocumento("87654567876");

        ContaInvestimento minhaConta = new ContaInvestimento(titular1,123, 987);

        ContaEspecial suaConta= new ContaEspecial(titular2,345, 567, 1_000);

//        minhaConta.depositar(15_000);
//        minhaConta.sacar(1000);
//        minhaConta.creditarRendimentos(0.8);

        suaConta.depositar(15_000);
        suaConta.sacar(15_500);

//        System.out.println("Titular: " + minhaConta.getTitular().getNome());
//        System.out.println("Saldo: " + minhaConta.getSaldo());

        System.out.println("Titular: " + suaConta.getTitular().getNome());
        System.out.println("Saldo: " + suaConta.getSaldo());
    }
}
