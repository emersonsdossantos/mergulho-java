public class Principal {

    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.nome = "Emerson Santos";
        titular1.documento = "12346886";

        Pessoa titular2 = new Pessoa();
        titular2.nome = "Agatha Ramires";
        titular2.documento = "87654567876";

        Conta minhaConta = new Conta(titular1,123, 987);
//        minhaConta.titular = titular1;
//        minhaConta.agencia = 123;
//        minhaConta.numero = 987;
//        minhaConta.saldo = 1000;

        Conta suaConta = new Conta();
        suaConta.titular = titular2;
        suaConta.agencia = 345;
        suaConta.numero = 567;
//        suaConta.saldo = 2000;

        minhaConta.depositar(10000);
        suaConta.depositar(500);

        minhaConta.sacarComTaxa(1000, 100);

        System.out.println("Titular: " + minhaConta.titular.nome);
        System.out.println("Saldo: " + minhaConta.saldo);

        System.out.println("Titular: " + suaConta.titular.nome);
        System.out.println("Saldo: " + suaConta.saldo);
    }
}
