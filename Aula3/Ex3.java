
import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String[] args) {
        int i =1;
        double soma = 0;
        while (i <= 5) {
            i++;
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número positivo: "));
            if (numero < 0) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número positivo.");
            } 
            soma += numero;
        }
        double media = soma / i;
        System.out.println("A média dos números digitados é: " + media);
    }
}

 
