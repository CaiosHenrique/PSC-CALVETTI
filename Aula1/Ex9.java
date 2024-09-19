package Aula1;
import javax.swing.JOptionPane;

public class Ex9 {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog("Digite o número:");
        String baseStr = JOptionPane.showInputDialog("Digite a base:");

        double numero = Double.parseDouble(numeroStr);
        double base = Double.parseDouble(baseStr);

        double logaritmo = Math.log(numero) / Math.log(base);

        JOptionPane.showMessageDialog(null, "O logaritmo de " + numero + " na base " + base + " é: " + logaritmo);
    }
}
