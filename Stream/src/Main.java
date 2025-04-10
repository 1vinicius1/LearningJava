import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();
        System.out.print("Enter salary: ");
        Double value = sc.nextDouble();
        System.out.println("Email of people whose salary is more than 2000.00: ");

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null){

                String[] fields = line.split(", ");
                String name = fields[0];
                String email = fields[1];
                Double salary = Double.parseDouble(fields[2]);
                list.add(new Employee(name, salary, email));

                line = br.readLine();
            }

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> emails = list.stream()
                    .filter(e -> e.getSalary() > value)
                    .map(e -> e.getEmail())
                    .sorted(comp)
                    .collect(Collectors.toList());

            emails.forEach(System.out::println);

            double sum = list.stream()
                    .filter(e -> e.getName().startsWith("M"))
                    .mapToDouble(Employee::getSalary)
                    .sum();

            System.out.printf("Sum of salary of people whose name starts with 'M': %.2f%n", sum);


        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }


    }
}