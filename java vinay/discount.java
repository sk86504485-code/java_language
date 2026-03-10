public class discount {
    public static void main(String[] args) {
        double price= 5000;
        double discount=10;
        double DA =(price*discount)/100;
        System.err.println("Discount amount is :"+DA);
        double fp=price-DA;
        System.err.println("Final price is :"+fp);
    }
    
}
