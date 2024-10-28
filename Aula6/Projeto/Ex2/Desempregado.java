public class Desempregado extends PessoaFisica {
    private double seguroDesemprego;

    public Desempregado(){
        seguroDesemprego = 0.0;
    }

    public Desempregado(String n, String s, String c, double d){
        super(n, s, c);
        this.seguroDesemprego = d;
    }
    
    public void ConsultarDados(){
        System.out.println("" + super.ConsultarDados());
        System.out.println("Valor Seguro Desemprego: " + seguroDesemprego);
    }

    public double getSeguroDesemprego() {
        return seguroDesemprego;
    }

    public void setSeguroDesemprego(double seguroDesemprego) {
        this.seguroDesemprego = seguroDesemprego;
    }
}
