
import javax.swing.JOptionPane;

public class Ex16 {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        int contador = 0;
        int a = 0;
        int b = 1;
        while (contador < numero) {
            contador++;
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        System.out.println("número da sequência de Fibonacci é: " + a);
    }
}
