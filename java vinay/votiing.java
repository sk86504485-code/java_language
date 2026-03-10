
import java.util.Scanner;

public class votiing {
    public static void main(String[] args) {
        System.out.println("Enter your age ");
        Scanner x = new Scanner(System.in);
        int age = x.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible for voting");
        } else {
            System.out.println("You are not eligible for voting");
        }
        x.close();
    }

}
