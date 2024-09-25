import javax.swing.JOptionPane;

public class Ex4 {
    public static void main(String[] args) {
        int i = 0;
        
        while (true) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            if (numero <= 0) {
                System.out.println("fim");
                break;
            } 
            if (numero >= 100 && numero <= 200) {
                i++;
            }
            System.out.println(numero);
        }
        System.out.println("Quantidade de números entre 100 e 200: " + i);

    }
}

