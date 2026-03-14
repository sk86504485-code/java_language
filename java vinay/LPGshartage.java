import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * LPG Shortage Alert System
 * यह प्रोग्राम एलपीजी की कमी के बारे में जानकारी प्रदान करता है
 * Features: Shorting gas  ,your new silender in 25 days, Booking ID tracking, Safety guidelines,dilevery updates,date tracking,price  your gas siloender
 **/


public class LPGshartage {
    public static void main(String[] args) {
    System.out.println("Welcome to the LPG Shortage Alert System!");
    System.out.println("Please enter  your  last  booking ID to check the status of your LPG cylinder:");
    Scanner sc=new Scanner(System.in);
    String  LastbookingID = sc.nextLine();
    System.out.println("Your last booking date is");
    long daysSinceLastBooking = ChronoUnit.DAYS.between(LocalDate.parse("2026-02-08"), LocalDate.now());
    System.out.println("Days since last booking: " + daysSinceLastBooking);
    long bookingConform=25-daysSinceLastBooking;
    System.out.println("Please enter your new booking ID to confirm your new LPG cylinder booking:");
    String BookinID=sc.nextLine();
    System.out.println("" + BookinID);
    if(bookingConform<=0){
        System.out.println("Your new LPG cylinder booking is confirmed.");// confirmation message
        System.out.println("Your new LPG cylinder will be delivered in 2 days."); // delivery update
    
    } else{
        System.out.println("Your new LPG cylinder will be confirmed in " + bookingConform + " days.");// cylinder booking confirmation time
    }
   // if(lastbookingID.equals("12345")) {
     //   System.out.println("Your new LPG cylinder will be delivered in 25 days.");
    //} else {
      //  System.out.println("Invalid booking ID. Please check your booking details and try again.");

//    }
    
    }
}
