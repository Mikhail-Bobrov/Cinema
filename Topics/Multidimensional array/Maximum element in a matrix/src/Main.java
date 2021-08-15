import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int size2 = sc.nextInt();
        int [][] arr = new int [size] [size2];
        int max=Integer.MIN_VALUE;
        int result1=0;
        int result2=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int[] inner = arr[i];
            for (int j = 0; j < arr[i].length; j++) {
                if (inner[j]>max){
                    max=inner[j];
                        result1=i;
                        result2=j;
                }
            }
        }
        System.out.println(result1+" "+result2);
    }
}