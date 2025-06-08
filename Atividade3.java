import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int [9];
        System.out.println("Insira 9 números:");
        for(int i = 0; i < 9; i++) {
            n[i] = sc.nextInt();
        }
        System.out.println("Números primos e suas posições:");
        for(int i = 0; i < 9; i++) {
            int numero = n[i];
            boolean primo = true;
            if (numero <= 1) {
                primo = false;
            } else {
                for(int j = 2; j < numero; j++){
                    if (numero % j == 0) {
                        primo = false;
                    }
                }
            }
            if (primo) {
                System.out.println("Número " + numero + " é primo, posição " + i);
            }
        }
        sc.close();
    }
}
