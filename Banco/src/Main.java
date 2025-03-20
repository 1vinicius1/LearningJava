import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double value = 0;

        Cliente cleito;
        System.out.print("Enter account number: ");
        String number = sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        String initialDeposit = sc.nextLine();
        if(initialDeposit.equals("y")){
            System.out.print("Enter initial deposit value: ");
            value = sc.nextDouble();
            cleito = new Cliente(holder, number, value);
            System.out.println();
        } else{
            cleito = new Cliente(holder, number);
            System.out.println();
        }


        System.out.println("Account data:");
        System.out.println(cleito);

        System.out.print("Enter a deposit value: ");
        cleito.deposit(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(cleito);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        cleito.saque(sc.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(cleito);




    }
}