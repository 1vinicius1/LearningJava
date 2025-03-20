import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char tipo = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Anual income: ");
            double rendaAnual = sc.nextDouble();
            if(tipo == 'i'){
                System.out.print("Health expenditures: ");
                double gastosSaude = sc.nextDouble();
                list.add(new pessoaFisica(nome, rendaAnual, gastosSaude));
            }
            else {
                System.out.print("Number of employees: ");
                int funcionarios = sc.nextInt();
                list.add(new pessoaJuridica(nome, rendaAnual, funcionarios));
            }
        }

        double total = 0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (Contribuinte cont : list) {
            System.out.println(cont);
            total += cont.imposto();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", total));


    }
}