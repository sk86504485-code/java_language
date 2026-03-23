
import java.util.Scanner;

public class studentMarks {

    public static void main(String[] args) {
        int NumberOfStudent = 10;
        //long totalmarks=0;
        long AvarageMarkAll = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            int totalmarks = 0;
            long averageMark = 0;
            // every student ke liye 5 subject ke mark input karane hai
            //every student ke marke ka Avarage and total fine karana
            System.out.println("Student " + i + " Enter number of 5 subject");
            for (int j = 1; j <= 5; j++) {
                int sub = sc.nextInt();
                totalmarks = totalmarks + sub;
                //if (sub < max) {
                /*      max = sub;
                    //System.out.println("Maximum number is:")
                }
                if (sub > min) {
                    min = sub;
                }*/
            }
            /*  System.out.println("Minimam number  student" + i + "is : " + max);
            System.out.println("Maximam number  student" + i + "is : " + min);*/

            averageMark = totalmarks / 5;
            System.out.println("Total Mark of student " + i + ":" + totalmarks);
            System.out.println("Aberage marks of student" + i + ":" + averageMark);
            // student given gread 
            if (averageMark >= 90) {
                System.out.println("Greade A");
            } else if (averageMark >= 80) {
                System.out.println("Greade A+");
            } else if (averageMark >= 70) {
                System.out.println("Greade B");
            } else if (averageMark >= 60) {
                System.out.println("Greade B+");
            } else if (averageMark >= 50) {
                System.out.println("Greade C");
            } else if (averageMark >= 40) {
                System.out.println("Greade C+");
            } else {
                System.out.println("Greade F");
            }
            AvarageMarkAll += averageMark;
            if (totalmarks < max) {
                max = totalmarks;
            }
            if (totalmarks > min) {
                min = totalmarks;
            }

        }

        //for (int n = 1; n <= 10; n++) {
        //All student Average marks , minimam, maxmam number
        AvarageMarkAll = AvarageMarkAll / 10;
        System.out.println("Avarage Mark of all student :" + AvarageMarkAll);
        System.out.println("Minimam number in all student is : " + max);
        System.out.println("Maximam number  in all student is : " + min);

        sc.close();

    }

}
