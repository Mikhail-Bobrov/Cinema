import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [][] arr = new int [size] [size];
        int a=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if (arr[i][j]!=arr[j][i]){
                    a=1;
               }
            }
    }
        if(a==0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
}}