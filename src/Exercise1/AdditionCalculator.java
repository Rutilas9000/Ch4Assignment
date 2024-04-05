package Exercise1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AdditionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            try {
                System.out.println("Enter two integers and the sum will be returned");
                System.out.print("Number 1: ");
                int num1 = scanner.nextInt();
                System.out.print("Number 2: ");
                int num2 = scanner.nextInt();
                int sum = num1 + num2;
                System.out.println("Sum: " + sum + " is the sum of " + num1 + " + " + num2);
                flag = false;
            }

            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter two integers");
                scanner.nextLine();
            }
        }
    }
}
