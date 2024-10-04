package Projeto.Ex2;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    public String getNome() {
        return nome;
    }

    public Produto(String n, double p, int q ){
        this.nome = n;
        this.preco = p;
        this.quantidade = q;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
