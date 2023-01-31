import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i<5; i++){
            System.out.println("Enter a number: ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The sorted array: ");
        for (int num: arr) {
            System.out.println(num);
        }
        sc.close();
    }
}
