public class Ch1Ex10 {
    public static void main(String[] args) {
        /* Distance: 14 kilometers
           Time: 45 minutes 30 seconds
           1 mile = 1.6 kilometers
        */
        
        // Kilometers theke miles-e convert kora
        double miles = 14 / 1.6;
        
        // Time-ke hours-e convert kora (45 min 30 sec = 45.5 minutes)
        double hours = 45.5 / 60.0;
        
        // Speed formula: distance / time
        double averageSpeed = miles / hours;

        System.out.println("Average speed in miles per hour:");
        System.out.println(averageSpeed);
    }
}
