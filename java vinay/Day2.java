import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.nextLine();
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        System.out.println("Your name " + name);
        System.out.println("your age is " + age);
        sc.close();
    }

}
