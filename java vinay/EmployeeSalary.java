
import java.util.Scanner;

class EmployeeSalary {

    public static void main(String[] args) {
        System.out.println("Enter number of employee :");
        Scanner sc = new Scanner(System.in);
        int numberOfEmployee = sc.nextInt();
        long totalSalaryAmount = 0;
        long AvrageSalary = 0;
        for (int i = 1; i <= numberOfEmployee; i++) {
            System.out.println("EnetrEmployee  " + i + " name:");
            String Name = sc.next();
            System.out.println("Enter" + Name + "salary :");
            long Salary = sc.nextLong();
            totalSalaryAmount += Salary;
        }
        AvrageSalary = totalSalaryAmount / numberOfEmployee;
        System.out.println("Total Salary amount of all employee is :" + totalSalaryAmount);
        System.out.println("Avarage salary of all employee is :" + AvrageSalary);
        sc.close();
    }
}
