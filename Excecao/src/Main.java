import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account acc1 = new Account(number, holder, initialBalance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double value = sc.nextDouble();
        try {
            acc1.withdraw(value);
        }
        catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

    }
}