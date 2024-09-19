package Aula1;
import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número inteiro:");
        
        int numero = Integer.parseInt(input);
        
        double resultado = Math.pow(numero, 2);
        
        JOptionPane.showMessageDialog(null, "O número " + numero + " ao quadrado é: " + resultado);
    }
}
