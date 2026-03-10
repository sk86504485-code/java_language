
import java.util.Scanner;

public class largestNo {
    public static void main(String[] args) {
        System.out.println("Enter 2 number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("Largest number is " + a);
        }
        sc.close();

    }

}
