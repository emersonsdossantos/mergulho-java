package com.algaworks.banco.app;

import com.algaworks.banco.modelo.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Joao da Silva","327817" );
        Pessoa pessoa2 = new Pessoa("Maria das Couves","987654" );

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);

//        Pessoa pessoa3 = pessoas.get(1);
//
//        System.out.println(pessoa3);

//        for (int i = 0; i < pessoas.size(); i++){
//            System.out.println(pessoas.get(i).getNome());

//        for (Pessoa pessoa : pessoas){
//            System.out.println(pessoa.getNome());
//        }

        Pessoa pessoa4 = new Pessoa("Joao da Silva","327817" );

        boolean existe = pessoas.contains(pessoa4);
        System.out.println(existe);

//        System.out.println(pessoa1.equals(pessoa4));
    }

}
