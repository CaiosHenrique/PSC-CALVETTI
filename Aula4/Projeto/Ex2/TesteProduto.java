package Projeto.Ex2;

import javax.swing.JOptionPane;

public class TesteProduto {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        Double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu preco"));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));

        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println(produto.getNome() + "\n" + produto.getPreco() + "\n" + produto.getQuantidade());

    }
}
