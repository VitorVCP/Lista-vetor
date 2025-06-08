import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];
        int somaPares = 0;
        int contImpares = 0;

        System.out.println("Digite 6 números inteiros:");
        for (int i = 0; i < 6; i++) {
            numeros[i] = sc.nextInt();
        }
        System.out.println("\nRELATÓRIO");
        System.out.println("Os números pares são:");
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.printf("número %d na posição %d%n", numeros[i], i + 1);
                somaPares += numeros[i];
            }
        }
        System.out.println("Soma dos pares = " + somaPares);
        System.out.println("Os números ímpares são:");
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.printf("número %d na posição %d%n", numeros[i], i + 1);
                contImpares++;
            }
        }
        System.out.println("Quantidade de ímpares = " + contImpares);
        sc.close();
    }
}
