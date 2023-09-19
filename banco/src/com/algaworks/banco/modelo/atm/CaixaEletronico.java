package com.algaworks.banco.modelo.atm;

import com.algaworks.banco.modelo.Conta;
import com.algaworks.banco.modelo.pagamento.DocumentoEstornavel;
import com.algaworks.banco.modelo.pagamento.DocumentoPagavel;

public class CaixaEletronico {

    public void imprimirSaldo(Conta conta){
        System.out.println("Conta: Agencia: " + conta.getAgencia() + " / Numero: " + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular().getNome() + " / Documento: " + conta.getTitular().getDocumento());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Saldo disponivel: " + conta.getSaldoDisponivel());
    }

    public void pagar(DocumentoPagavel documento, Conta conta){
        if (documento.estaPago()){
            throw new IllegalStateException("O documento ja está pago");
        }
        conta.sacar(documento.getValorTotal());
        documento.quitarPagamento();
    }

    public void estornarPagamento(DocumentoEstornavel documento, Conta conta){
        if (!documento.estaPago()){
            throw new IllegalStateException("Documento não está pago");
        }
        conta.depositar(documento.getValorTotal());
        documento.estornarPagamento();
    }
}
