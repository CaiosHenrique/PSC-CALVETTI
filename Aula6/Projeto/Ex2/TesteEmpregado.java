public class TesteEmpregado {
    public static void main(String[] args) {
        Horista h = new Horista("João", "Silva", "12345678900", "horista", 1500.0);
        Mensalista m = new Mensalista("Maria", "Oliveira", "98765432100", "mensalista", 3000.0);
        Tarefeiro t = new Tarefeiro("Carlos", "Santos", "11223344556", "tarefeiro", 2000.0);
        
        h.ConsultarDados();
        System.out.println(h.salario());

        m.ConsultarDados();
        System.out.println(m.salario());
        
        t.ConsultarDados();
        System.out.println(t.salario());
    }
}
