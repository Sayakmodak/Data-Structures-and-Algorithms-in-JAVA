public class palindromeString {
    public static void main(String[] args) {
        String str = "madam";

        String revStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }

        if (revStr.equals(str)) {
            System.out.print("Palindrome String");
        } else {
            System.out.print("Not palindrome string");
        }
    }
}
