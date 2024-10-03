import javax.swing.JOptionPane;

public class Ex21 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            String nome = JOptionPane.showInputDialog("Digite o nome:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
            String sexo = JOptionPane.showInputDialog("Digite o sexo (M/F):");

            if (sexo.toUpperCase().equals("M") && idade > 21) {
                JOptionPane.showMessageDialog(null, "Nome: " + nome);
            }
        }
    }
}
