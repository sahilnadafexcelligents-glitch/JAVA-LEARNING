public class Whileloop {
    public static void main(String[] args) {
        boolean isstudent = false;
        int i = 1; // Initialize counter
        
        while (isstudent && i <= 50) {  // Loop while student AND i <= 50
            System.out.println("Number: " + i);
            i++; // DON'T FORGET TO UPDATE!
            
            // Optional: If you want to stop when i reaches 51
            if (i > 50) {
                isstudent = false; // This will exit the loop
            }
        }
    }
}