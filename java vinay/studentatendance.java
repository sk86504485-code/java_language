
import java.util.Scanner;

public class studentatendance {

    public static void main(String[] args) {
        System.out.println("\n\n\n:::::::Wellcome to Student Attendance System::::::::\n\n\n");
        String arr[] = {"vinay", "vikas", "Divyash", "Himashu", "Satyarth", "Shivam"};
        int totalstudent = 6;
        Scanner sc = new Scanner(System.in);
        int Totalpresent = 0;
        for (int i = 0; i < 6; i++) {
            //if student are present  than p else A;
            System.out.println(arr[i] + "  is :");
            char Student = sc.next().charAt(0);
            if (Student == 'P') {
                Totalpresent++;
            }
            // System.err.print(Student);

        }
        int Totalabsent = totalstudent - Totalpresent;
        System.out.println("total absent students:" + Totalabsent);
        System.out.println("Total present students: " + Totalpresent);
    }

}
