import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int fact = 1;
        System.out.println("Enter a number:");
        int num = input.nextInt();
        while(num >= i){
            fact *= i;
            i+=1;
        }
        System.out.println("Factorial: " + fact);

    }
}
