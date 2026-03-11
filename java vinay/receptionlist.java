
import java.util.Scanner;

public class receptionlist {
    public static void main(String[] args) {
       /*  String name="vinay yadav";
        long phone=1234567890;
        long adharnumber=123456789012;

        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Aadhar Number: " + adharnumber);
        System.out.println();*/
        System.out.println("Welcome to our hotel! We hope you have a pleasant stay.");
        Scanner sc= new Scanner(System.in);
        System.out.println("RSV Hotel Etah");
        System.out.println(" AC+luaxzary rooom=5000 par day");
        System.out.println(" luxzary rooom=4500 par day");
        System.out.println(" AC rooom=4000 par day");
        System.out.println(" simple rooom=2000 par day\n");
        System.out.println("Which type room you need:");
        String roomType=sc.nextLine();
        System.out.println();
        boolean isCheckedIn ;
        System.out.println("Is the room available? (true/false)");
        isCheckedIn = sc.nextBoolean();
        if(isCheckedIn){
            System.out.println("Yes room is available");
            String name="vinay yadav" ;
            long phone =1234567890;
            long  adharNumber=9121234567890L;
            System.out.println("Enter your name:");

           //vinay yadav            name = sc.nextLine(); // Consume the newline character
            name = sc.nextLine() ; // Read the actual name input
            System.out.println("Name: " + name);
            System.out.println("Phone:" + phone); 
            System.out.println("Aadhar Number: " + adharNumber);
            boolean payment=true;
            if(payment){
                System.out.println("Payment successful. Enjoy your stay!");
                long roomnumber=123;
                System.out.println("Your room number is: " + roomnumber);
            }
            else{
                System.out.println("Payment failed. Please try again.");
            }



        }
        else System.out.println("Sorry, the room is not available. Please try again later.");
        sc.close();
    }
    
}
 