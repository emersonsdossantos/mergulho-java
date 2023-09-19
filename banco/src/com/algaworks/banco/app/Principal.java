package com.algaworks.banco.app;

import com.algaworks.banco.modelo.*;
import com.algaworks.banco.modelo.atm.CaixaEletronico;
import com.algaworks.banco.modelo.pagamento.Boleto;
import com.algaworks.banco.modelo.pagamento.DocumentoPagavel;
import com.algaworks.banco.modelo.pagamento.Holerite;

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

        minhaConta.depositar(30_000);
        minhaConta.sacar(1000);
//        minhaConta.creditarRendimentos(0.8);
//        minhaConta.debitarTarifaMensal();

        suaConta.depositar(15_000);
        suaConta.sacar(15_500);
        suaConta.debitarTarifaMensal();

        Boleto boletoEscola = new Boleto(titular2, 800);
        Holerite salarioFuncionario = new Holerite(titular2, 100, 160);

        caixaEletronico.pagar(boletoEscola, minhaConta);
        caixaEletronico.pagar(salarioFuncionario, minhaConta);

        caixaEletronico.estornarPagamento(boletoEscola, minhaConta);

        boletoEscola.imprimirRecibo();
        System.out.println();
        salarioFuncionario.imprimirRecibo();
        System.out.println();

//        System.out.println("Boleto pago: " + boletoEscola.estaPago());
//        System.out.println("Salario pago: " + salarioFuncionario.estaPago());

        caixaEletronico.imprimirSaldo(minhaConta);
        System.out.println();
        caixaEletronico.imprimirSaldo(suaConta);

    }
}
