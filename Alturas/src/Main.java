import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();
        Pessoa[] pessoas = new Pessoa[n];
        double alturas = 0;
        double idades = 0;
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            alturas += altura;
            idades += idade;
            sc.nextLine();

            pessoas[i] = new Pessoa(nome, altura, idade);
        }

        System.out.println();
        double alturamedia = (alturas / n);
        System.out.printf("Altura média: %.2f%n", alturamedia);
        System.out.println("Pessoas com menos de 16 anos: ");
        int g = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                g++;
            }
        }
        System.out.printf("%.1f",(double) g/n * 100);
        System.out.print("%");
        System.out.println();
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }


    }
}