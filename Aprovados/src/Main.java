import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] nomes = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
            nomes[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < n; i++) {
            if(nota1[i] + nota2[i] >= 12){
                System.out.println(nomes[i]);
            }

        }

    }
}