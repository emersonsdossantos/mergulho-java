package com.algaworks.banco.modelo.pagamento;

import java.math.BigDecimal;

public interface DocumentoPagavel {

    BigDecimal getValorTotal();
    boolean estaPago();
    void quitarPagamento();

    default void imprimirRecibo(){
        System.out.println("Recibo:");
        System.out.println("Valor Total: " + getValorTotal());
        System.out.println("Pago: " + estaPago());
    }

}
