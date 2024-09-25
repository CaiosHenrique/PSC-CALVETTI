import javax.swing.JOptionPane;

public class Ex14 {
    public static void main(String[] args) {
        int quantidadePrimos = 0;

        while (true) {
            String input = JOptionPane.showInputDialog("Digite um número inteiro positivo (ou um número não positivo para parar):");
            int numero = Integer.parseInt(input);

            if (numero <= 0) {
                break;
            }

            if (ehPrimo(numero)) {
                quantidadePrimos++;
            }
        }

        System.out.println("Quantidade de números primos: " + quantidadePrimos);
    }

    public static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
