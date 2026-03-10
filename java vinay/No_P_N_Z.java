import java.util.Scanner;

public class No_P_N_Z {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number");
        n = sc.nextInt();
        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        sc.close();

    }
}