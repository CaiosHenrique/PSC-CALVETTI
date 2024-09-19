package Aula1;
import javax.swing.JOptionPane;

public class Ex4 {
    public static void main(String[] args) {
        String str1 = JOptionPane.showInputDialog("Digite a primeira string:");
        String str2 = JOptionPane.showInputDialog("Digite a segunda string:");
        String str3 = JOptionPane.showInputDialog("Digite a terceira string:");

        int totalLength = str1.length() + str2.length() + str3.length();

        JOptionPane.showMessageDialog(null, "A soma do comprimento das strings é: " + totalLength);
    }
}
