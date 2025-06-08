import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprovado = 0;
        int[] gabarito = new int [8];
        int[][] respostas = new int [4][8];
        int[] notas = new int[10];

        System.out.println("Digite o gabarito da prova");
        for (int i = 0; i < 4; i++) {
            System.out.println("Questão " + (i + 1) + ":");
            gabarito[i] = sc.nextInt();
        }
        System.out.println("Insira as respostas");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                respostas[i][j] = sc.nextInt(); 
            }
        }
        for (int i = 0; i < 10; i++) {
            int nota = 0;
            for (int j = 0; j < 8; j++) {
                if (respostas[i][j] == gabarito[j]) {
                    nota++;
                }
                notas[i] = nota;
                if (nota>= 6) {
                    aprovado++;
                }
            System.out.println("Notas alunos: ");
            for(int k = 0; k < 10; k++) {
                System.out.println("Aluno" + (k+1) + ": " + notas[i] + " pontos");
               }
            }
        }
        double aprovados = (aprovado/ 10.0) * 100;
        System.out.println("Percentual de aprovação: " + aprovados + "%");
        sc.close();
    }
}
