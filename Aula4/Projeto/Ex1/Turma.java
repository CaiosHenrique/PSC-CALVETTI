public class Turma  {
    private String nome;
    private String curso;
    private int quantAlunos;
    private int serie;

    public Turma(String n, String c, int q, int s){
        this.nome = n;
        this.curso = c;
        this.quantAlunos = q;
        this.serie = s;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getQuantAlunos() {
        return quantAlunos;
    }
    public void setQuantAlunos(int quantAlunos) {
        this.quantAlunos = quantAlunos;
    }
    public int getSerie() {
        return serie;
    }
    public void setSerie(int serie) {
        this.serie = serie;
    }
}