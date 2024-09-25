import javax.swing.JOptionPane;

public class Ex15 {
    public static void main(String[] args) {
        int numero; 
        int maior = -9998;
        while (true) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (ou -9999 para sair):"));

            if (numero == -9999) {
                break;
            }

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("Maior número digitado: " + maior);
    }
}
