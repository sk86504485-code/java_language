
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        // String username ="Vinay";
        // String password="2291";
        System.out.println("User name :");
        Scanner sc = new Scanner(System.in);
        String use = sc.nextLine();
        System.out.println("Password :");
        String pass = sc.nextLine();
        if (use.equals("Vinay") && pass.equals("1234")) {
            System.err.println("Login successful");
        } else {
            System.err.println("Invalid login ID and password");
        }
        sc.close();
    }

}
