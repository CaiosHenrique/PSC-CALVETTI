import javax.swing.JOptionPane;

public class Ex5 {
    public static void main(String[] args) {
        while (true) {
           String nome = JOptionPane.showInputDialog("Digite um nome: ");
            if (nome.equals("fim") || nome.equals("FIM")|| nome.equals("Fim")) {
                break;
            } 
            System.out.println(nome);
        }

    }
}
