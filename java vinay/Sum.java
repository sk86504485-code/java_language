
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enten two number :");
        Scanner vy = new Scanner(System.in);
        int n1 = vy.nextInt();
        int n2 = vy.nextInt();
        int sum = n2 + n1;
        System.out.println("Sum of two number  : " + sum);
        vy.close();

    }

}
