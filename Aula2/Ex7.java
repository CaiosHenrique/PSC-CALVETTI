import javax.swing.JOptionPane;

public class Ex7 {
    public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("Escreva seu nome");
    String sexo = JOptionPane.showInputDialog("Escreva o sexo");
    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));

        if (idade > 25 && sexo == "f" || sexo == "F" || sexo == "Feminino" || sexo == "feminino" ) {
            System.out.println("ACEITA!");
            
        }
        else { 
            System.out.println("RECUSADA!");
        }
    }
}
