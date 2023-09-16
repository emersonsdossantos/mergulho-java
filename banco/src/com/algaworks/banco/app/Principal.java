package com.algaworks.banco.app;

import com.algaworks.banco.modelo.*;

public class Principal {

    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("Emerson Santos");
        titular1.setDocumento("12346886");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Agatha Ramires");
        titular2.setDocumento("87654567876");

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaInvestimento minhaConta = new ContaInvestimento(titular1,123, 987);
        ContaEspecial suaConta= new ContaEspecial(titular2,345, 567, 1_000);

        minhaConta.depositar(15_000);
        minhaConta.sacar(1000);
        minhaConta.creditarRendimentos(0.8);

        suaConta.depositar(15_000);
        suaConta.sacar(15_500);

        caixaEletronico.imprimirSaldo(minhaConta);
        System.out.println();
        caixaEletronico.imprimirSaldo(suaConta);

    }
}
