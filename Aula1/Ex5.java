package Aula1;

public class Ex5 {
    public static void main(String[] args) {
        double valorInicial = 100.00;
        double juros = 10.0;
        int meses = 8;

        double valorFinal = calcularDivida(valorInicial, juros, meses);
        System.out.println("Valor da dívida após " + meses + " meses: R$ " + valorFinal);
    }

    public static double calcularDivida(double valorInicial, double juros, int meses) {
        return valorInicial * Math.pow((1 + juros / 100), meses);
    }
    
}
