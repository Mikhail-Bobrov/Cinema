import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <= 100) {
            int[][] array = new int[number][number];
            for (int i = 0; i < number; i++) {
                array[i][0] = i;
            }
            for (int i = 0; i < number; i++) {    //fills the left part
                for (int j = 1; j < i; j++) {
                    array[i][j] = array[i][j - 1] - 1;
                }
            }
            for (int i = 0; i < number; i++) {     //fills the right part
                for (int j = i + 1; j < number; j++) {
                    array[i][j] = array[i][j - 1] + 1;
                }
            }
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.print("\n");
            }
        }

    }
}
