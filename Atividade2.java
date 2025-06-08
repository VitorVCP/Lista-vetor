import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] n = new int[8];
        int [] nPositivo = new int[8];
        int [] nNegativo = new int[8];
        int cPositivo = 0, cNegativo = 0;

        System.out.println("Digite 8 números inteiros, pode ser posivivo ou negativo ");
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();

            if (n[i] >= 0) {
                nPositivo[cPositivo] = n[i];
                cPositivo++;
            } else {
                nNegativo[cNegativo] = n[i];
                cNegativo++;
            }
        }
        System.out.println("Números Positivos:");
        for (int i = 0; i < cPositivo; i++) {
            System.out.println(nPositivo[i] + " ");
        }
        System.out.println("Números Negativos:");
        for (int i = 0; i < cNegativo; i++) {
            System.out.println(nNegativo[i] + " ");
        }
        sc.close();
    }
}
