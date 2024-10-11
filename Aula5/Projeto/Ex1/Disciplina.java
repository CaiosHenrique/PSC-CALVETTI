package Ex1;

public class Disciplina  {
    private String nome;
    private boolean pratica;

    public Disciplina(String n, Boolean p){
        this.nome = n;
        this.pratica = p;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getPratica() {
        return pratica;
    }

    public void setPratica(boolean pratica) {
        this.pratica = pratica;
    }

    public String getDados(){
        return "\nNome da disciplina: " + getNome() + "\nPratica: " + getPratica();
    }
    
}