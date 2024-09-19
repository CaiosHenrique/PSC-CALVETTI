package Aula1;
import javax.swing.JOptionPane;

public class Ex6 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número inteiro de 3 casas decimais:");

        char dezenas = input.charAt(input.length() - 2);
        JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas é: " + dezenas);
    }
}
