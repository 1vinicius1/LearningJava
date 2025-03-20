import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vec = new double[n];
        double sum = 0;

        for (int i = 0; i < vec.length; i++) {
            System.out.print("Digite um numero: ");
            vec[i] = sc.nextDouble();
            sum += vec[i];
        }

        System.out.println();
        double media = (sum/n);
        System.out.printf("MEDIA DO VETOR = %.3f%n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < vec.length; i++) {
            if(vec[i] < media) {
                System.out.printf("%.1f%n", vec[i]);
            }
        }






    }
}