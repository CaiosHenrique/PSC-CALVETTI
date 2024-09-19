package Aula1;
import javax.swing.JOptionPane;

public class Ex17 {
    public static void main(String[] args) {
        String baseString = JOptionPane.showInputDialog("Digite a base do triângulo:");
        String alturaString = JOptionPane.showInputDialog("Digite a altura do triângulo:");

        double base = Double.parseDouble(baseString);
        double altura = Double.parseDouble(alturaString);
        double area = (base * altura) / 2;

        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area);
    }
}
