package Exercise2;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class RandomArray {
    public static void main(String[] args) {
        boolean flag = true;
        double[] array = new double[50];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble() * 100;
        }
        while (flag) {
            try {
                System.out.println("Enter an index between 0 - 49 and its value will be returned.");
                System.out.print("index: ");
                int index = scanner.nextInt();
                System.out.println(index + " ---> " + array[index]);
                flag = false;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ERROR: please enter a valid index between 0 - 49");
                scanner.nextLine();
            }
            catch (InputMismatchException e) {
                System.out.println("ERROR: please enter a valid index between 0 - 49. MUST BE AN INTEGER");
                scanner.nextLine();
            }
        }
    }
}