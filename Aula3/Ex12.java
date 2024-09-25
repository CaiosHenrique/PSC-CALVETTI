import javax.swing.JOptionPane;

public class Ex12 {
    public static void main(String[] args) {
        int menos21 = 0;
        int mais50 = 0;
        while (true) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade (ou fora da faixa 0-120 para sair):"));
            if (idade < 0 || idade > 120) {
                break;
            }
            if (idade < 21) {
                menos21++;
            } else if (idade > 50) {
                mais50++;
            }
        }
        System.out.println("Quantidade de pessoas com menos de 21 anos: " + menos21);
        System.out.println("Quantidade de pessoas com mais de 50 anos: " + mais50);
    }
}
