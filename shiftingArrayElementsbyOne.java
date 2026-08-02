public class shiftingArrayElementsbyOne {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        int n = arr.length;

        // step1: last element k temp er moddhe rakha
        int temp = arr[n - 1];

        // elements gulo k shift kora holo by 1
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // last element ke first element er moddhe copy kora holo
        arr[0] = temp;

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}