import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc  = new Scanner(System.in);

        int M = sc.nextInt();

        int book = 3000;
        int mask = 1000;
        int pen = 500;

        if(book <= M){
            System.out.println("book");
        }else if(mask <= M){
            System.out.println("mask");
        }else if(pen <= M){
            System.out.println("pen");
        }else{
            System.out.println("no");
        }
    }
}