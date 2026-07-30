import java.util.Scanner;

public class countNumberOfEvenDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        int count = 0;

        while (num > 0) {
            int rem = num % 10; // 3 2

            if (rem % 2 == 0) {
                count++;
            }

            num = num / 10; // 12 1
        }

        System.out.println("Number of even digits are: " + count);
        sc.close();
    }
}