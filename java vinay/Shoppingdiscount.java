
import java.util.Scanner;

public class Shoppingdiscount {

    public static void main(String[] args) {
        //if shopping card mauntis more than  999 that 10%discount
        // oterbise ifshopping card maunt 500 to999 than 5% discount oterbise no discount
        //shopping discount use loop and if else statement 
        double numofitems;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of items you want to buy :");
        numofitems = sc.nextDouble();
        double totalamount = 0;
        for (int i = 1; i <= numofitems; i++) {
            System.out.println("enter the price of item " + i);
            double price = sc.nextDouble();
            totalamount += price;
        }
        System.out.println("Total amount before discount is :" + totalamount);
        if (totalamount >= 999) {
            //10%discout 
            double dicount = totalamount * 0.1;
            double finalamount = totalamount - dicount;
            System.out.println("total amount after discount is:" + finalamount);

        } else if (totalamount >= 500 && totalamount < 999) {
            //5%dicount
            double dicount = totalamount * 0.05;
            double finalamount = totalamount - dicount;
            System.out.println("Total amount after discount  is :" + finalamount);

        } else {
            System.out.println("No discount applied, Total amount is :" + totalamount);

        }

    }
}
