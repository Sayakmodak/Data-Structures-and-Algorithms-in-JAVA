public class printExtremeElementsAlternately {

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        if (n % 2 == 0) {
            while (i < j) {
                System.out.print(arr[i] + " " + arr[j]);

                i++;
                j--;

                System.out.print(" ");
            }
        } else {
            while (i <= j) {
                if (i == j) {
                    System.out.println(arr[i]);
                    break;
                }

                System.out.print(arr[i] + " " + arr[j]);
                i++;
                j--;

                System.out.print(" ");
            }
        }
    }
}