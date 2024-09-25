import javax.swing.JOptionPane;

public class Ex20 {
    public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        double menor = Math.min(numero1, numero2);
        double maior = Math.max(numero1, numero2);
        double quadradoDoMenor = Math.pow(menor, 2);

        String resultado = "O quadrado do menor número (" + menor + ") é: " + quadradoDoMenor;

        if (maior >= 0) {
            double raizQuadradaDoMaior = Math.sqrt(maior);
            resultado += "A raiz quadrada do maior número (" + maior + ") é: " + raizQuadradaDoMaior;
        } else {
            resultado += "\nO maior número (" + maior + ") é negativo, então sua raiz quadrada não pode ser calculada.";
        }

        System.out.println(resultado);
    }
}