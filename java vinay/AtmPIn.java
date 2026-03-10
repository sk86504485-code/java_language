
import java.util.Scanner;

public class AtmPIn {
    public static void main(String[] args) {
        System.err.println(":::Wellcome my ATM :::");
        System.err.println("Enter your ATM pin");
        Scanner sc = new Scanner(System.in);
        String PIN = sc.nextLine();
        if (PIN.equals("2291")) {
            System.err.println("Correct");
        } else {
            System.err.println("Incorrect");
        }
        sc.close();
    }
}
