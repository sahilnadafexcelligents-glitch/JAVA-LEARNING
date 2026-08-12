// HOSPITAL PATIENT TEMPERATURE TRACKER
// ------------------------------------

public class HospitalTracker {
    public static void main(String[] args) {
        // Temperatures of 5 patients (in Celsius)
        double[] temperatures = { 98.6, 99.2, 101.5, 97.8, 98.4 };

        double total = 0;
        int feverCount = 0;

        for (int i = 0; i < temperatures.length; i++) {
            total += temperatures[i];

            if (temperatures[i] > 100.0) {
                System.out.println("ALERT: Patient " + (i + 1) + " has fever!");
                feverCount++;
            }
        }

        double average = total / temperatures.length;
        System.out.println("Average temperature: " + average);
        System.out.println("Total fever cases: " + feverCount);
    }
}
