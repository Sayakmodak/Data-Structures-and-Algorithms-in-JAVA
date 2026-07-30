import java.util.Scanner;

public class isEven {
    static boolean even(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");

        int num = sc.nextInt();

        if (even(num)) {
            System.out.println("Even number");
        } else {
            System.out.print("Odd number");
        }
        sc.close();
    }
}