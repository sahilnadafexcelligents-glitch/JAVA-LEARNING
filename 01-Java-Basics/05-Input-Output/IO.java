import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
      
         // =============== OUTPUT METHODS ===============
         // System.out.print("Sahil Nadaf "); // print() - prints without moving to the next line
         // System.out.println("Sahil Nadaf"); // println() - prints and moves to the next line
         // System.out.printf("Formatted output: %s %d %n", "Sahil", 25); // printf() - formatted output like C
        
        // =============== SCANNER INITIALIZATION ===============
        Scanner sc = new Scanner(System.in);
       
        // =============== INTEGER INPUT ===============
        System.out.println("\n=== INTEGER INPUT ===");
        System.out.print("Enter The Integer : ");
        int a = sc.nextInt(); // Reads integer value
        System.out.println("You entered: " + a);
        
        // Consume the leftover newline character after nextInt()
        sc.nextLine();
        
        // =============== STRING INPUT ===============
        System.out.println("\n=== STRING INPUT ===");
        System.out.print("Enter The Full Name (String) : ");
        String fullName = sc.nextLine(); // Reads entire line including spaces
        System.out.println("Full Name: " + fullName);
        
        System.out.print("Enter The First Name (Single Word) : ");
        String firstName = sc.next(); // Reads only one word (stops at space)
        System.out.println("First Name: " + firstName);
        
        // =============== BYTE INPUT ===============
        System.out.println("\n=== BYTE INPUT ===");
        System.out.print("Enter The Byte (Range: -128 to 127) : ");
        byte b = sc.nextByte(); // Reads byte value
        System.out.println("Byte value: " + b);
        
        // =============== SHORT INPUT ===============
        System.out.println("\n=== SHORT INPUT ===");
        System.out.print("Enter The Short (Range: -32,768 to 32,767) : ");
        short s = sc.nextShort(); // Reads short value
        System.out.println("Short value: " + s);
        
        // =============== LONG INPUT ===============
        System.out.println("\n=== LONG INPUT ===");
        System.out.print("Enter The Long (Large numbers) : ");
        long l = sc.nextLong(); // Reads long value
        System.out.println("Long value: " + l);
        
        // =============== FLOAT INPUT ===============
        System.out.println("\n=== FLOAT INPUT ===");
        System.out.print("Enter The Float (Example: 3.14f) : ");
        float Value2 = sc.nextFloat(); // Reads float value
        System.out.println("Float value: " + Value2);
        
        // =============== DOUBLE INPUT ===============
        System.out.println("\n=== DOUBLE INPUT ===");
        System.out.print("Enter The Double (Example: 12.5) : "); 
        double Value = sc.nextDouble(); // If we input 12, it automatically converts to 12.0
        System.out.println("Double value: " + Value);
        
        // =============== BOOLEAN INPUT ===============
        System.out.println("\n=== BOOLEAN INPUT ===");
        System.out.print("Enter The Boolean (true/false) : ");
        boolean Value1 = sc.nextBoolean(); // Only accepts true or false (case-insensitive)
        System.out.println("Boolean value: " + Value1);
        
        // =============== CHARACTER INPUT ===============
        System.out.println("\n=== CHARACTER INPUT ===");
        System.out.print("Enter The Character (Single character) : ");
        char ch = sc.next().charAt(0); // Reads first character of input
        System.out.println("Character value: " + ch);
        
        // =============== BIG INTEGER INPUT ===============
        System.out.println("\n=== BIG INTEGER INPUT ===");
        System.out.print("Enter The BigInteger (Very large integer) : ");
        java.math.BigInteger bigInt = sc.nextBigInteger(); // Handles arbitrarily large integers
        System.out.println("BigInteger: " + bigInt);
        
        // =============== BIG DECIMAL INPUT ===============
        System.out.println("\n=== BIG DECIMAL INPUT ===");
        System.out.print("Enter The BigDecimal (High precision decimal) : ");
        java.math.BigDecimal bigDec = sc.nextBigDecimal(); // Handles high precision decimals
        System.out.println("BigDecimal: " + bigDec);
        
        // =============== HAS NEXT METHODS ===============
        System.out.println("\n=== HAS NEXT METHODS ===");
        System.out.print("Check if there is integer input: ");
        boolean hasInt = sc.hasNextInt(); // Checks if next token is integer
        System.out.println(hasInt);
        
        sc.nextLine(); // Consume the newline */
 
        // =============== USING DELIMITER ===============
        System.out.println("\n=== USING CUSTOM DELIMITER ===");
        System.out.print("Enter multiple numbers separated by comma (e.g., 10,20,30) : ");
        sc.useDelimiter(","); // Change delimiter to comma
        while (sc.hasNext()) {
            String token = sc.next();
            System.out.println("Token: " + token);
        } 
        
         Reset delimiter to default (whitespace)
         sc.useDelimiter("\\s+");
        
          =============== CLOSE SCANNER ===============
         sc.close(); // Always close the scanner to prevent resource leak
         System.out.println("\nScanner closed successfully!");
        
        // =============== ADDITIONAL OUTPUT METHODS ===============
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
        
        System.out.println("\n=== ESCAPE SEQUENCES ===");
        System.out.println("Tab\tSpace"); // \t for tab
        System.out.println("New\nLine"); // \n for new line
        System.out.println("Backslash: \\"); // \\ for backslash
        System.out.println("Quote: \""); // \" for double quote
        System.out.println("Single quote: \'"); // \' for single quote
        System.out.println("Carriage return\rHello"); // \r for carriage return
    }
}