package com.algaworks.banco.app;

import com.algaworks.banco.modelo.*;
import com.algaworks.banco.modelo.atm.CaixaEletronico;
import com.algaworks.banco.modelo.excecao.SaldoInsuficienteException;
import com.algaworks.banco.modelo.pagamento.Boleto;
import com.algaworks.banco.modelo.pagamento.DocumentoPagavel;
import com.algaworks.banco.modelo.pagamento.Holerite;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Principal {

    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("Emerson Santos");
        titular1.setDocumento("12346886");
        titular1.setRendimentoAnual(new BigDecimal("15000"));
        titular1.setDataUltimaAtualizacao(LocalDateTime.parse("2023-09-28T17:00"));
        System.out.println("Data/hora: " + titular1.getDataUltimaAtualizacao());

        System.out.println("Tipo: " + titular1.getTipo());

        BigDecimal rendimento = titular1.getRendimentoAnual();
        System.out.println("Rendimento: " + rendimento);

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Agatha Ramires");
        titular2.setDocumento("87654567876");
        titular2.setTipo(TipoPessoa.JURIDICA);
        System.out.println("Tipo titular 2: " + titular2.getTipo());

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaInvestimento minhaConta = new ContaInvestimento(titular1,123, 987);
        ContaEspecial suaConta= new ContaEspecial(titular2,345, 567, new BigDecimal("1000"));
        try {
            minhaConta.depositar(new BigDecimal("30000"));
            minhaConta.sacar(new BigDecimal("10000"));
//        minhaConta.creditarRendimentos(0.8);
//        minhaConta.debitarTarifaMensal();

            suaConta.depositar(new BigDecimal("15000"));
            suaConta.sacar(new BigDecimal("15000"));
            suaConta.debitarTarifaMensal();

            Boleto boletoEscola = new Boleto(titular2, new BigDecimal("35000"));
            Holerite salarioFuncionario = new Holerite(titular2, new BigDecimal("100"), 160);

            caixaEletronico.pagar(boletoEscola, minhaConta);
            caixaEletronico.pagar(salarioFuncionario, minhaConta);

            caixaEletronico.estornarPagamento(boletoEscola, minhaConta);

            boletoEscola.imprimirRecibo();
            System.out.println();
            salarioFuncionario.imprimirRecibo();
            System.out.println();
        } catch (SaldoInsuficienteException e){
            System.out.println("Erro na transação Bancária: " + e.getMessage());
        }
//        System.out.println("Boleto pago: " + boletoEscola.estaPago());
//        System.out.println("Salario pago: " + salarioFuncionario.estaPago());

        caixaEletronico.imprimirSaldo(minhaConta);
        System.out.println();
        caixaEletronico.imprimirSaldo(suaConta);

    }
}
