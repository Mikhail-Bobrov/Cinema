package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int sizeRows = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int rowSize = sc.nextInt();
        System.out.println("Cinema:");
        System.out.print(" ");
        String[][] arr = new String[sizeRows][rowSize];
        for (int i = 1; i < rowSize + 1; i++) {
            System.out.print(" " + i);
        }

        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(arr[i], "S ");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            System.out.print(i + 1 + " ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
        }
        System.out.println();
        System.out.println("Enter a row number:");
        int firstIndex = sc.nextInt();
        System.out.println("Enter a seat number in that row:");
        int secondIndex = sc.nextInt();
        if ((sizeRows*rowSize)<60){
            System.out.println("Ticket price: $10");
        }
        else if (firstIndex<=(sizeRows/2)){
            System.out.println("Ticket price: $10");
        }
        else {
            System.out.println("Ticket price: $8");
        }
        arr[firstIndex-1][secondIndex-1]="B ";
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i < rowSize + 1; i++) {
            System.out.print(" " + i);}
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            System.out.print(i + 1 + " ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);}
        }
    }
}