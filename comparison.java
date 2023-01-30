import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int first = scan.nextInt();

        System.out.println("Enter second number:");
        int second = scan.nextInt();

        if (first > second){
            System.out.println("First is greater");
        }
        else if (second > first){
            System.out.println("Second is greater");
        }
        else {
            System.out.println("Both are equal");
        }
    }
}
