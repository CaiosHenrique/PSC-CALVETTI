import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Escreva o primeiro numero"));

        if (num1 > 0) {
            System.out.println("A Raiz quadrada do numeor é: " + Math.pow(num1, 2));
        }
        else { 
            System.out.println("O Quadrado do numero é: " + Math.sqrt(num1));
        }
    }
}
