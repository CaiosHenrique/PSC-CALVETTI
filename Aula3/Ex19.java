import javax.swing.JOptionPane;

public class Ex19 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular o fatorial:"));

        int fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é " + fatorial);
    }
}
