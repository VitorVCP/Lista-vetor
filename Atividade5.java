import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temperaturas = new double[12];
        String[] meses = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};
        System.out.println("Qual a temperatura média de cada mês:");
        for(int i = 0; i < 12; i++) {
            temperaturas[i] = sc.nextDouble();
        }
        double MAtemperatura = temperaturas[0];
        double MEtemperatura = temperaturas[0];
        int mesMAtemperatura = 0, mesMEtemperatura = 0;
        for (int i = 1; i < 12; i++) {
            if (temperaturas[i] > MAtemperatura) {
                MAtemperatura = temperaturas[i];
                mesMAtemperatura = i;
            } 
            if (temperaturas[i] < MEtemperatura) {
                MEtemperatura = temperaturas[i];
                mesMEtemperatura = i;
            }
        }
        System.out.println("\nMAior temperatura foi: " + MAtemperatura + " em " + meses[mesMAtemperatura]);
        System.out.println("\nMenor temperatura foi: " + MEtemperatura + " em " + meses[mesMEtemperatura]);
        sc.close();
    }
}
