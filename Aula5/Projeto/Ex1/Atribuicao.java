package Ex1;

public class Atribuicao  {
    private Professor professor;
    private Disciplina disciplina;

    public Atribuicao(Professor p, Disciplina d){
        this.professor = p;
        this.disciplina = d;
    }

    public String getDados(){
        return professor.getDados() + disciplina.getDados();
    }
}