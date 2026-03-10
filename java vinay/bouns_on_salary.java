public class bouns_on_salary {
    public static void main(String[] args) {
        double salary = 5000000;
        double bouns = 10;
        double BA = (salary * bouns) / 100;
        System.err.print("Bouns amount is :" + BA);
        double FS = salary + BA;
        System.err.println("\n Total salary is :" + FS);

    }

}
