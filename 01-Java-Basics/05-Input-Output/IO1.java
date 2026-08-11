public class IO1 {
    public static void main(String[] args) {
        
        System.out.println("\n=== FORMATTED OUTPUT ===");
        int num = 42;
        double pi = 3.14159265359;
        String name = "Java";

        // Format specifiers
        System.out.printf("Integer: %d%n", num); // %d for integers
        System.out.printf("Float: %.3f%n", pi); // %.3f for 3 decimal places
        System.out.printf("String: %10s%n", name); // %10s for width 10
        System.out.printf("Octal: %o, Hex: %x%n", num, num); // %o for octal, %x for hex
        System.out.printf("Scientific notation: %e%n", pi); // %e for scientific notation
    }
}
