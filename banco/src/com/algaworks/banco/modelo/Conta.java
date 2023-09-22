package com.algaworks.banco.modelo;

import com.algaworks.banco.modelo.excecao.SaldoInsuficienteException;

import java.util.Objects;

public abstract class Conta {

    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo;

    Conta(){
    }

    public Conta(Pessoa titular, int agencia, int numero){
        Objects.requireNonNull(titular);
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void depositar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("O valor depositado de ser a cima de 0");
        }
        saldo = saldo + valor;
    }

    public void sacar(double valor){

        if (valor <= 0){
            throw new IllegalArgumentException("O valor deve ser a cima de 0");
        }
        if (getSaldoDisponivel() - valor <= 0){
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
        saldo = saldo - valor;
    }

    public void sacarComTaxa(double valor, double taxa){
        sacar(valor + taxa);
    }

    public abstract void debitarTarifaMensal();

    public Pessoa getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaldoDisponivel(){
        return getSaldo();
    }
}