import java.util.Objects;

public class Conta {

    Pessoa titular;
    int agencia;
    int numero;
    double saldo;

    Conta(){
    }

    Conta(Pessoa titular, int agencia, int numero){
        Objects.requireNonNull(titular);
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    void depositar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("O valor depositado de ser a cima de 0");
        }
        saldo = saldo + valor;
    }

    void sacar(double valor){
        if (saldo - valor <= 0){
            throw new IllegalStateException("Saldo Insulficiente");
        }
        if (valor <= 0){
            throw new IllegalArgumentException("O valor deve ser a cima de 0");
        }
        saldo = saldo - valor;
    }

    void sacarComTaxa(double valor, double taxa){
        sacar(valor + taxa);
    }
}
