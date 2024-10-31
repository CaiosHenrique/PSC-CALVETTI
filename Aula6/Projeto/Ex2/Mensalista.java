public class Mensalista extends Empregado {
    private double salario;

    public Mensalista(String n, String s, String c, String n1, double s1){
        super(n, s, c, n1);
        this.salario = s1;
    }

    public double salario(){
        return this.salario;
    }
}
