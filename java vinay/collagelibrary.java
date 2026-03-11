import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Collage Library Management System
 * यह प्रोग्राम पुस्तकालय में किताबों के issue और return को manage करता है
 * Features: Student info, Book tracking, Late fee calculation
 */
public class collagelibrary {
    
    /**
     * Main method - Library system ka entry point
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Collage Library!");
        // Additional code to manage the collage library can be added he
        String libraryName = "My Collage Library";
        long PhoneNumber = 1234567890L;
        System.out.println("Library Name: " + libraryName);
        System.out.println("Phone Number: " + PhoneNumber);
        boolean isOpen = true;
        System.out.println("Is the library open? " + isOpen);
        
        // Library khula hai to aage ka code chalega
    if(isOpen) {
        System.out.println("The library is currently open. Feel free to explore our collection!");
        System.out.println("We have a wide range of collages available for you to browse and enjoy.");
        //library cards  and books isuseand return code can be added here
        
        // Student ka information store karo
        String StudentName="vinay yadav";
        int StudentID=12345;
        long ContactNumber=9876543210L;
        long LibraryCardNumber=54321;
        System.out.println("Student Name: " + StudentName);
        System.out.println("Student ID: " + StudentID);
        System.out.println("Contact Number: " + ContactNumber);
        System.out.println("Library Card Number: " + LibraryCardNumber);
        //book issue 
        // Book ka information aur date input lo
        String BookTitle="The Great Gatsby";
        System.out.println("Book Title: " + BookTitle);
        System.out.println("You have successfully issued the book: " + BookTitle);
        System.out.println("Enter the issue date (YYYYMMDD format):");
         Scanner sc = new Scanner(System.in);
        LocalDate IssueDate = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt()); // YYYY, MM, DD

        //System.out.println("Issue Date: " + IssueDate);
        System.err.println("Please return the book in 14 days to avoid late fees.");
        System.out.println("Enter the return date (YYYYMMDD format):");
        LocalDate ReturnDate = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt()); // Return date input
        System.out.println("Return date: "+ ReturnDate);
        
        // Check if book returned late (14 days se zyada par to fine lagega)
        if((ReturnDate.minusDays(14)).isAfter(IssueDate)) {
            // Late days calculate karo
            long daysLate = ChronoUnit.DAYS.between(IssueDate, ReturnDate) - 14; // Assuming a 14-day borrowing period
            System.out.println("Book returned late by " + daysLate + " days.");
            System.out.println("You fine 0.5$ per day for late return.");
            System.out.println("You have to pay: " + (daysLate * 0.5));
            System.out.println("Have you paid the late fee? (true/false)");
            boolean isLatefeePaid = sc.nextBoolean();
            // Check if user paid the fine
            if(isLatefeePaid) {
                System.out.println("Thank you for paying the late fee. We appreciate your cooperation.");
            } else {
                System.out.println("Please pay the late fee as soon as possible to avoid further penalties.");
                System.out.println("You have not paid the late fee yet.");
            }
        }
        else {
            System.out.println("Book returned on time. Thank you!");
        }    

        // Scanner ko close karo (memory leak avoid karne ke liye)
        sc.close(); 
    } else {
        System.out.println("The library is currently closed. Please visit us during our working hours.");
    }

  }
}