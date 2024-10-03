import javax.swing.JOptionPane;

public class Ex24 {
    public static void main(String[] args) {
        double total = 0.0;

        while (true) {
            double preco = -1;
            int quantidade = -1;

            do {
                preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da mercadoria:"));
                if (preco < 0) {
                    System.out.println("Preço inválido. Digite um valor positivo.");
                }
            } while (preco < 0);

            do {
                quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de itens comprados:"));
                if (quantidade < 0) {
                    System.out.println("Quantidade inválida. Digite um valor positivo.");
                }
            } while (quantidade < 0);

            if (quantidade == 0) {
                break;
            }

            total += preco * quantidade;
        }

        System.out.println("Total da compra: " + total);
    }
}
