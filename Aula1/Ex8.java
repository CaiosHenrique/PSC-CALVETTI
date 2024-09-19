package Aula1;
import javax.swing.JOptionPane;

public class Ex8 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número:");
        double number = Double.parseDouble(input);
        double logBase10 = Math.log10(number);
        JOptionPane.showMessageDialog(null, "O logaritmo na base 10 de " + number + " é: " + logBase10);
    }
}
