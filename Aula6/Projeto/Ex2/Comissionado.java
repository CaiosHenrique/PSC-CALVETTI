public class Comissionado extends Mensalista {
    private double comissao;

    public Comissionado(String n, String s, String c, String n1, double s1, double comissao){
        super(n, s, c, n1, s1);
        this.comissao = comissao;
    }

    public double Salario(){
        return super.salario()+comissao;
    }
}
