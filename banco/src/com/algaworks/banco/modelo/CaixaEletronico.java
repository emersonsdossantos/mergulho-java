package com.algaworks.banco.modelo;

public class CaixaEletronico {

    public void imprimirSaldo(Conta conta){
        System.out.println("Conta: Agencia: " + conta.getAgencia() + " / Numero: " + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular().getNome() + " / Documento: " + conta.getTitular().getDocumento());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Saldo disponivel: " + conta.getSaldoDisponivel());
    }
}
