import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] vendas = new double[12][4];
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        System.out.println("Digite os valores das vendas por semana de cada mês:");

        for (int i = 0; i < 12; i++) {
            System.out.println("Mês: " + meses[i]);
            for (int j = 0; j < 4; j++) {
                System.out.print("  Semana " + (j + 1) + ": R$ ");
                vendas[i][j] = sc.nextDouble();
            }
        }
        System.out.println("\n=== Total de vendas por mês ===");
        double totalAno = 0;
        for (int i = 0; i < 12; i++) {
            double totalMes = 0;
            for (int j = 0; j < 4; j++) {
                totalMes += vendas[i][j];
            }
            System.out.println(meses[i] + ": R$ " + totalMes);
            totalAno += totalMes;
        }
        System.out.println("\n=== Total de cada semana no ano ===");
        for (int j = 0; j < 4; j++) {
            double totalSemana = 0;
            for (int i = 0; i < 12; i++) {
                totalSemana += vendas[i][j];
            }
            System.out.println("Semana " + (j + 1) + ": R$ " + totalSemana);
        }
        System.out.println("\nTotal vendido no ano: R$ " + totalAno);

        sc.close();

        
    }
}
