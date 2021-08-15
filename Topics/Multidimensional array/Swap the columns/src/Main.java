import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int size2 = sc.nextInt();
        int [][]arr = new int [size][size2];

        for (int i = 0; i < arr.length; i++) {
            int count =0;
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=count;
                count++;
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            int temp;
            for (int j = 0; j < arr.length; j++) {
                temp=arr[1][j];
                arr[1][j]=arr[1+1][j];
                arr[1+1][j]=temp;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}