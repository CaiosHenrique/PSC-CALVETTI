package Aula1;
import javax.swing.JOptionPane;

public class Ex15 {
    public static void main(String[] args) {
        String num1String = JOptionPane.showInputDialog("Digite o primeiro número inteiro (dividendo):");
        String num2String = JOptionPane.showInputDialog("Digite o segundo número inteiro (divisor):");

        int num1 = Integer.parseInt(num1String);
        int num2 = Integer.parseInt(num2String);

        int quociente = num1 / num2;
        int resto = num1 % num2;

        JOptionPane.showMessageDialog(null, "Dividendo: " + num1 + "\nDivisor: " + num2 + "\nQuociente: " + quociente + "\nResto: " + resto);
    }
}
