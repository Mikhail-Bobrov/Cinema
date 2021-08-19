package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
    static int row;
    static int size;
    static Scanner sc = new Scanner(System.in);
    static int firstIndex;
    static int secondIndex;
    static String[][] arr = new String[row][size];
    static String be = "B ";

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        int rowsSize = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = sc.nextInt();
        row = rowsSize;
        size = seats;
        for (String[] strings : arr) {
            Arrays.fill(strings, "S ");
        }

            do
            { switch (showTheChoice()) {
            case 1:
                cinema();
                break;
            case 2:
                ticket();
                break;
            case 0:
                end();
            default:

        }}
        while (showTheChoice()!=0);
        }




    public static int showTheChoice() {
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("0. Exit");
        return sc.nextInt();
    }

    public static void cinema() {


        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i < arr.length + 1; i++) {
            System.out.print(" " + i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            System.out.print(i + 1 + " ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }

        }
        System.out.println();
    }

    public static void ticket() {
        System.out.println("Enter a row number:");
        int firstIndex1 = sc.nextInt();
        System.out.println("Enter a seat number in that row:");
        int secondIndex1 = sc.nextInt();
        if ((row * size) < 60) {
            System.out.println("Ticket price: $10");
        } else if (firstIndex <= (row / 2)) {
            System.out.println("Ticket price: $10");
        } else {
            System.out.println("Ticket price: $8");
        }
        firstIndex = firstIndex1;
        secondIndex = secondIndex1;
        cinemaChanged(firstIndex1,secondIndex1);
    }

    public static void cinemaChanged(int number1, int number2) {
        if (arr[number1][number2].equals(be)) {
            arr[number1][number2] = "B ";
        }

    }

    public static void end() {


    }
}


