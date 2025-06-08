import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] x = new int[5];
        int [] y = new int[5];
        int [] z = new int[10];
        System.out.println("Primeiro vetor");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            x[i] = sc.nextInt();
        }
        System.out.println("Segundo vetor");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            y[i] = sc.nextInt();
        }
        int a = 0;
        for (int i = 0; i < 5; i++) {
            z[a++] = x[i];
            z[a++] = y[i];

        }
        for (int i = 0; i < 10; i++){
            System.out.println(z[i] + " ");
        }
        sc.close();
    }
}
