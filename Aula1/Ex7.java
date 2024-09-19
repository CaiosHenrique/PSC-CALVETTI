package Aula1;
import javax.swing.JOptionPane;

public class Ex7 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ângulo em graus: ");
        double graus = Double.parseDouble(input);
        double radianos = Math.toRadians(graus);

        double seno = Math.sin(radianos);
        double cosseno = Math.cos(radianos);
        double tangente = Math.tan(radianos);
        double secante = 1 / cosseno;
        double cossecante = 1 / seno;
        double cotangente = 1 / tangente;

        JOptionPane.showMessageDialog(null,"seno: " + seno + "\ncosseno: " + cosseno + "\ntangente: " + tangente + "\nsecante: " + secante + "\ncossecante: " + cossecante + "\ncotangente: " + cotangente);
    }
}