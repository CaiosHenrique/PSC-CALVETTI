package Aula1;
import javax.swing.JOptionPane;

public class Ex14 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o raio do círculo:");

        double radius = Double.parseDouble(input);
        double area = 3.14159 * radius * radius;

        JOptionPane.showMessageDialog(null, "A área do círculo é: " + area);
    }
}
