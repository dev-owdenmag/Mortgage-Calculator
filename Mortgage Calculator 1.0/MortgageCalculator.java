import java.text.NumberFormat;
import java.util.Scanner;

//  Mortgage Calculator 1.0

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte months_in_a_year = 12;
        final byte percent = 10;

        System.out.println("Welcome to my first Java project");
        System.out.println("This is a Mortgage Calculator");

        System.out.print("Enter your principal:");
        int principal = scanner.nextInt();
        System.out.println("Principal (1K - 1M) : " + principal);

        System.out.print("Enter your annual interest rate: ");
        double annualInterest = scanner.nextDouble();
        System.out.println("Annual Interest Rate: " + annualInterest);
        double monthlyInterest = annualInterest / percent / months_in_a_year;

        System.out.print("Enter your Period (Years): ");
        int years = scanner.nextInt();
        System.out.println("Period (Years): " + years);
        int numberOfPayments = years * months_in_a_year;

        double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
        }
    }