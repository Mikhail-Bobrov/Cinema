import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        if (x<=0){
           return f1(x);
        }
        else if (0<x && x<1){
          return   f2(x);
        }
        else if(x>=1){
          return   f3(x);
        }
        else {
            return 0;
        }
    }

    //implement your methods here
    public static double f1 (double x1){
        return (x1*x1)+1;
    }

    public static double f2 (double x2){
        return 1/(x2*x2);
    }

    public static double f3 (double x3){
        return (x3*x3)-1;
    }
}