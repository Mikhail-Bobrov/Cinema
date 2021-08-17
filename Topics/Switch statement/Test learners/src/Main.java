import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int b = 3;
        int a = 3;
        while (b > 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        System.out.println(a);
    }}