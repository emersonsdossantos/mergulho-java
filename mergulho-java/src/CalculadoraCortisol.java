public class CalculadoraCortisol {
    public static void main(String[] args) {
        double cortisol = 5;

//        boolean resultadoCortisol = cortisol >= 6.0 & cortisol <= 18.6;
//        boolean resultadoAnormal = !resultadoCortisol;
//        System.out.println("Cortisol Normal: " + resultadoCortisol);
//        System.out.println("Cortisol Anormal: " + resultadoAnormal);
        if (cortisol >= 6.0 & cortisol <= 18.6){
            System.out.println("Cortisol normal");
        } else if (cortisol > 18.7) {
            System.out.println("Cortisol alto");
        }else {
            System.out.println("Cortisol baixo");
        }

    }
}
