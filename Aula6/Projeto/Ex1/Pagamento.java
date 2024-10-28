public class Pagamento {

    private String nomeDoPagador;
    private String CPF;
    private double valorASerPago;

    public Pagamento(String n, String c, double v){
        this.nomeDoPagador = n;
        this.CPF = c;
        this.valorASerPago = v;
    }

    public String getNomeDoPagador() {
        return nomeDoPagador;
    }

    public void setNomeDoPagador(String nomeDoPagador) {
        this.nomeDoPagador = nomeDoPagador;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public double getValorASerPago() {
        return valorASerPago;
    }

    public void setValorASerPago(double valorASerPago) {
        this.valorASerPago = valorASerPago;
    }

}