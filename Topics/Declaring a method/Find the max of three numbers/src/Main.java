import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
       int number1= Math.max(b , c );
       int number2 = Math.max(a , number1);
       if (number1==a){
           return 1;
       }
       else if (b==c){
           return b;
       }
       else {
           return number2;
       }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}