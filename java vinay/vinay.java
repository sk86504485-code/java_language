import java.util.Scanner;

class day2 {
    public static void main(String[] args) {
        System.out.println(" Wellcome java programing ");
        double pai = 3.14;
        int r = 4;
        double area = pai * r * r;
        System.out.println("Area of cricle is" + area);
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        System.out.println("input value" + i);
        input.close();
    }
}