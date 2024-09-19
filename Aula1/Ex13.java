package Aula1;
import javax.swing.JOptionPane;

public class Ex13 {

    public static void main(String[] args) {
        String valorA = JOptionPane.showInputDialog("Digite o valor de a:");
        String valorB = JOptionPane.showInputDialog("Digite o valor de b:");
        String valorC = JOptionPane.showInputDialog("Digite o valor de c:");

        double a = Double.parseDouble(valorA);
        double b = Double.parseDouble(valorB);
        double c = Double.parseDouble(valorC);

        double resultado = 2 * ((a - c) / 8) - b * 5;

        JOptionPane.showMessageDialog(null, "O resultado da expressão é: " + resultado);
    }
}
