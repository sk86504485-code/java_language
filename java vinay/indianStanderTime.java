public class indianStanderTime {

    public static void main(String[] args) {
        System.out.println("\n\n\n::::::::Welcome to Indian Standard Time:::::::;\n\n\n");
        long currentTimeMillis = System.currentTimeMillis();

        // Convert to seconds, minutes, hours in UTC
        long totalSeconds = currentTimeMillis / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHourUtc = totalHours % 24;

        // IST is UTC+5:30
        long istHour = (currentHourUtc + 5 + (currentMinute + 30) / 60) % 24;
        long istMinute = (currentMinute + 30) % 60;

        System.out.println("Current Indian Standard Time is " + istHour + ":" +  istMinute + ":" + currentSecond);
    }
}