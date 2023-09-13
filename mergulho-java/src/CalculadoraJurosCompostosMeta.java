public class CalculadoraJurosCompostosMeta {
    public static void main(String[] args) {
        double valorAcumulado = 10000;
        double valorMeta = 20000;
        double taxaJurosMensal = 0.8;
        int mes = 0;

        while (valorAcumulado < valorMeta){
            valorAcumulado +=  valorAcumulado * taxaJurosMensal / 100;
            mes++;
            System.out.println("Mes " + mes + " = " + valorAcumulado);
        }

    }
}
