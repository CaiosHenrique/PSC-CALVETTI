import javax.swing.JOptionPane;

public class Ex14 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número inteiro de 4 casas decimais:");
        
        int numeros = Integer.parseInt(input.substring(0, 2));
        System.out.println(numeros);

        if (numeros % 4 == 0) {
            System.out.println("Divisor de 4!");
        }
        else{
            System.out.println("Numero nao divide por 4.");
        }
    }
}
