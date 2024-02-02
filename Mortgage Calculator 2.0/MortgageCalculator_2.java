import java.text.NumberFormat;
import java.util.Scanner;

//  Mortgage Calculator 2.0
// This version of the Mortgage Calculator comes with input validation
public class MortgageCalculator_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte months_in_a_year = 12;
        final byte percent = 10;
        final int  principalRange1 = 1000;
        final int  principalRange2 = 1000_000;
        final int checkAnnRge1 = 1;
        final int checkAnnRge2 = 30;
        double monthlyInterest = 0;
        int numberOfPayments = 0;
        int principal = 0;


        System.out.println("Welcome to my first Java project");
        System.out.println("This is a Mortgage Calculator");

        while (true) {
            System.out.print("Enter your principal (1K - 1M): ");
            principal = scanner.nextInt();
            if (principal >= principalRange1 && principal <= principalRange2)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }

        while (true) {
            System.out.print("Enter your annual interest rate: ");
            double annualInterest = scanner.nextDouble();
            if (annualInterest >= checkAnnRge1 && annualInterest <= checkAnnRge2){
                monthlyInterest = annualInterest / percent / months_in_a_year;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true) {
            System.out.print("Enter your Period (Years): ");
            int years = scanner.nextInt();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * months_in_a_year;
            }
            break;
        }
        System.out.println("Enter a value between 1 and 30");

        double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}