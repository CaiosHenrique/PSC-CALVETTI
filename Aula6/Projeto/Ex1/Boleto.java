public class Boleto extends Pagamento {
    public String NumeroDoBoleto;
    public int dia;
    public int mes;
    public int ano;

    public Boleto(String n, String c, double v, String num, int d, int m, int a){
        super(n, c, v);
        this.NumeroDoBoleto = num;
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }
    public String getNumeroDoBoleto() {
        return NumeroDoBoleto;
    }
    public void setNumeroDoBoleto(String numeroDoBoleto) {
        NumeroDoBoleto = numeroDoBoleto;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}
