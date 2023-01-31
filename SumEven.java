import java.util.Scanner;
public class SumEven {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int sm = 0;
                do{
                    System.out.println("Enter a number: ");
                    int num = scan.nextInt();
                    if (num % 2 == 0){
                        count++;
                        sm += num;
                    }
                }
                while(count < 10);
                System.out.println("Sum of even numbers: " +sm);
    }

}
