package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean circle = true;
        System.out.println("Enter the number of rows:");
        int rowsSize1 = sc.nextInt();

            System.out.println("Enter the number of seats in each row:");
            int seats1 = sc.nextInt();
            String arr[][] = new String[rowsSize1 + 1][seats1 + 1];
            buildCinema(arr);

            while (circle) {
                System.out.println("1. Show the seats");
                System.out.println("2. Buy a ticket");
                System.out.println("0. Exit");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        cinema(arr);
                        break;
                    case 2:
                        ticket(arr, rowsSize1, seats1);
                        break;
                    case 0:
                        circle = false;
                        break;
                }


        }
    }

    public static void buildCinema(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 && j != 0) {
                    arr[i][j] = String.valueOf(j);
                } else if (i != 0 && j == 0) {
                    arr[i][j] = String.valueOf(i);
                } else if (i != 0 && j >= 1 && j <= arr[i].length) {
                    arr[i][j] = "S";
                } else if (i == 0 && j == 0) {
                    arr[i][j] = " ";
                }
            }
        }
    }


    public static void cinema(String arr[][]) {
        System.out.println("Cinema:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; (arr[i] != null && j < arr[i].length); j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ticket(String[][] arr, int rows, int seats) {

        Scanner sc = new Scanner(System.in);
        int ticket;
        int specificRow;
        int specificSeat;
        int totalSeats;

        System.out.println("Enter a row number:");
        specificRow = sc.nextInt();
        System.out.println("Enter a seat number in that row:");
        specificSeat = sc.nextInt();
        if (specificRow <= rows && specificSeat <= seats) {

            totalSeats = (rows - 1) * (seats - 1);

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (i == specificRow && j == specificSeat) {
                        arr[i][j] = "B";
                    }
                }
            }

            if (totalSeats > 60) {
                if (specificRow < rows / 2) {
                    ticket = 10;
                } else {
                    ticket = 8;
                }
            } else {
                ticket = 8;
            }

            System.out.println("Ticket price: $" + ticket);
        }
    }
}

