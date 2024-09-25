import javax.swing.JOptionPane;

public class Ex13 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número inteiro de 3 casas decimais:");

        char dezenas = input.charAt(input.length() - 2);
        if (dezenas % 2 == 0) {
            System.out.println("Numero par!");
        }
        else{
            System.out.println("Numero impar!");
        }
    }   
}
