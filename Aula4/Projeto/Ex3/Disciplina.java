package Projeto.Ex3;

public class Disciplina {
    private String nome;
    private String professor;
    private int semestre;
    private boolean ofertada;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getProfessor() {
        return professor;
    }
    public void setProfessor(String professor) {
        this.professor = professor;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public boolean isOfertada() {
        return ofertada;
    }
    public void setOfertada(boolean ofertada) {
        this.ofertada = ofertada;
    }
    public Disciplina(String n, String p, int s, boolean o){
        this.nome = n;
        this.professor = p;
        this.semestre = s;
        this.ofertada = o;
    }
}
