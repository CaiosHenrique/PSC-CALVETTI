package Ex1;

public class Professor {
    private String nome;
    private int idade;

    public Professor(String n, int i){
        this.nome = n;
        this.idade = i;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDados(){
        return "Nome: " + getNome() + "\nIdade: " + getIdade();
    }
   
}