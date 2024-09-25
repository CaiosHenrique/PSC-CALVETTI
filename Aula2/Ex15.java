import javax.swing.JOptionPane;

public class Ex15 {
    public static void main(String[] args) {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento"));

        if (input > 2024 || input < 0) {
            System.out.println("idade invalida");
        }
    
        int idade = input - 2024;
        System.out.println("Sua idade é: " + idade);

        
    }
}
