package Aula1;
import javax.swing.JOptionPane;

public class Ex16 {
    public static void main(String[] args) {
        String numString = JOptionPane.showInputDialog("Digite um número:");

        double numero = Double.parseDouble(numString);
        double quadrado = Math.pow(numero, 2);
        double raiz = Math.sqrt(numero);

        JOptionPane.showMessageDialog(null, "Numero: " + numero + "\nQuadrado: " + quadrado + "\nRaiz: " + raiz);
    }
}
