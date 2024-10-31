public class Empregado extends PessoaFisica {
    private String nome;

    public Empregado(){
        this.nome = "nomezudo";
    }

    public Empregado(String n, String s, String c, String n1){
        super(n, s, c);
        this.nome = n1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private double salario(){
        return 0.0;
    }
}
