public class Principal {

    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("Emerson Santos");
        titular1.setDocumento("12346886");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Agatha Ramires");
        titular2.setDocumento("87654567876");

        Conta minhaConta = new Conta(titular1,123, 987);

        Conta suaConta = new Conta(titular2,345, 567);

        minhaConta.depositar(10000);
        suaConta.depositar(500);

        minhaConta.sacarComTaxa(1000, 100);

        System.out.println("Titular: " + minhaConta.getTitular().getNome());
        System.out.println("Saldo: " + minhaConta.getSaldo());

        System.out.println("Titular: " + suaConta.getTitular().getNome());
        System.out.println("Saldo: " + suaConta.getSaldo());
    }
}
