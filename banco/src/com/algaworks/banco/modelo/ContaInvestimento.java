package com.algaworks.banco.modelo;

public class ContaInvestimento  extends Conta{

    public ContaInvestimento(Pessoa titular, int agencia, int numero){
        super(titular, agencia, numero);
    }

    public void creditarRendimentos(double percentualJuros){
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        depositar(valorRendimentos);
    }

    @Override
    public void debitarTarifaMensal(){
        if (getSaldo() < 10_000){
            sacar(30);
        }
    }
}
