package Aula1;
import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String[] args) {

        String baseStr = JOptionPane.showInputDialog("Digite a base do retângulo:");
        double base = Double.parseDouble(baseStr);

        String alturaStr = JOptionPane.showInputDialog("Digite a altura do retângulo:");
        double altura = Double.parseDouble(alturaStr);

        double area = base * altura;

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "A área do retângulo é: " + area);
    }
}