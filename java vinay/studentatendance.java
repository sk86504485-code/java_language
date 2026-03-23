
import java.util.Scanner;

public class studentatendance {

    public static void main(String[] args) {
        System.out.println("\n\n\n:::::::Wellcome to Student Attendance System::::::::\n\n\n");
       System.out.print(" \n Enter total numbner of student in class  :");
        Scanner sc = new Scanner(System.in);
        int totalstudent = sc.nextInt();
        System.out.println(" \n\n\n:::::::::::Enter 'p' for present and 'A' for adsent student:::::\n\n\n");
        System.out.println("\n\n::::::Student present or absent is roll number wise :::::::::\n\n\n");
    
        int Totalpresent = 0;
        for (int i = 0; i < totalstudent; i++) {
            //if student are present  than p else A;
            System.out.print(" \n Student " + (i + 1) +"::" );
            
            char Student = sc.next().charAt(0);
            if (Student == 'P') {
                Totalpresent++;
            }
            // System.err.print(Student);

        }
        int Totalabsent = totalstudent - Totalpresent;
        System.out.println("total absent students:" + Totalabsent);
        System.out.println("Total present students: " + Totalpresent);
        sc.close();
    }

}
