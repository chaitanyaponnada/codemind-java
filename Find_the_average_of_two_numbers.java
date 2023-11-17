import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextDouble();

        double num2 = scanner.nextDouble();

        double average = (num1 + num2) / 2;

        System.out.printf("%.4f", average);

        scanner.close();
    }
}
