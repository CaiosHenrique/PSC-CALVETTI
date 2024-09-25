
public class Ex9 {

    public static void main(String[] args) {
        int i = 1;
        while (i < 100) {
            System.out.println(i);
            i++;
            int soma = 0;
            int j = 1;
            while (j <= i) {
                j++;
                soma += j;
            }
            System.out.println("Soma de " + i + ": " + soma);
        }
    }
}
