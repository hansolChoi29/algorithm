import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(2) == ch || arr[i].charAt(3) == ch) {
                System.out.println(arr[i]);
                count++;
            }
        }

        System.out.println(count);
    }
}