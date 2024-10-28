public class PessoaFisica {
    public String nome;
    public String sobrenome;
    public String CPF;

    public PessoaFisica(){
        nome = "Pedro";
        sobrenome = "Alvares";
        CPF = "12323123";
    };

    public PessoaFisica(String n, String s, String c){
        this.nome = n;
        this.sobrenome = s;
        this.CPF = c;
    };

    public void ConsultarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("CPF: " + CPF);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    };

}
