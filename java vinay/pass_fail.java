
import java.util.Scanner;

public class pass_fail {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();
        if (num >= 33) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        x.close();
    }
}
