import java.util.Scanner;

public class Main {
    public static void printNumbers(int num1, int num2, int numPerLine) {
        if (num1 < num2) {
            int count = 0;
            for (int i = num1; i <= num2; i++) {
                System.out.print(i + " ");
                count++;
                if (count == numPerLine) {
                    System.out.println();
                    count = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of numbers per line: ");
        int numPerLine = input.nextInt();
        
        System.out.print("Enter the first number (num1): ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number (num2): ");
        int num2 = input.nextInt();

        input.close();

        printNumbers(num1, num2, numPerLine);
    }
}
