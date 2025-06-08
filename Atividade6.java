import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] precos = new double[10];
        int[] quantidades = new int[10];
        double[] totais = new double[10];

        System.out.println("Digite o preço e a quantidade vendida de cada produto (10 no total):");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Produto %d - Preço: R$ ", i + 1);
            precos[i] = sc.nextDouble();
            System.out.printf("Produto %d - Quantidade vendida: ", i + 1);
            quantidades[i] = sc.nextInt();
            totais[i] = precos[i] * quantidades[i];
        }

        double totalv = 0;
        for (int i = 0; i < 10; i++) {
            totalv += totais[i];
        }

        double comissao = totalv * 0.05;

        System.out.println("\nRelatório:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Objeto %d: Quantidade vendida = %d, Preço unitário = R$ %.2f, Valor total = R$ %.2f%n",
                    (i + 1), quantidades[i], precos[i], totais[i]);
        }

        System.out.printf("%nTotal vendido: R$ %.2f%n", totalv);
        System.out.printf("Comissão do vendedor (5%%): R$ %.2f%n", comissao);

        sc.close();
    }
}

