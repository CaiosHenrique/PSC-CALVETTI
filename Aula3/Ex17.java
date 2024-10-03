
public class Ex17 {
    public static void main(String[] args) {
        String tabela = "Polegadas\tCentímetros\n";
        for (int i = 1; i <= 20; i++) {
            double centimetros = i * 2.54;
            tabela += i + "\t\t" + centimetros + "\n";
        }
        System.out.println(tabela);
    }
}
