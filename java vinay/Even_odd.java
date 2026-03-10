
import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        // int y= num.nextInt();
        if (x % 2 == 0) {
            System.out.println("Number Even ");
        } else
            System.out.println("Number odd");
        num.close();
    }

}
