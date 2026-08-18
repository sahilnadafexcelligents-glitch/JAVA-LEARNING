public class Main {
    
    // Method with parameters and return value
    static int add(int a, int b) {
        return a + b;
    }
    
    static int subtract(int a, int b) {
        return a - b;
    }
    
    static int multiply(int a, int b) {
        return a * b;
    }
    
    // Void method that prints result
    static void displayResult(int result) {
        System.out.println("Result: " + result);
    }
    
    // Method with no parameters
    static void showMenu() {
        System.out.println("=== CALCULATOR ===");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
    }
    
    public static void main(String[] args) {
        showMenu(); // Call void method
        
        int sum = add(10, 5);
        displayResult(sum); // Output: Result: 15
        
        int diff = subtract(10, 5);
        displayResult(diff); // Output: Result: 5
        
        int product = multiply(10, 5);
        displayResult(product); // Output: Result: 50
    }
}