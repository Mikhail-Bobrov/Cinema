// Don't delete scanner import
import java.util.Scanner;

class Name {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.next();
        String lastName1 = scanner.next();
        System.out.println(Name.createFullName(name1,lastName1));
        // use this program as a source of inspiration for your method




    }

    //implement your method here
    public static String createFullName (String name1 , String name2){

        return name1+" "+name2;
    }
}