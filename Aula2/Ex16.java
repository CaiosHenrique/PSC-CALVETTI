import javax.swing.JOptionPane;

public class Ex16 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro Numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo numero"));

        if (n1 == n2) {
            System.out.println("Numeros Iguais");
        }
        else {
            System.out.println("Numeros diferentes");
        }
        
    }
}
