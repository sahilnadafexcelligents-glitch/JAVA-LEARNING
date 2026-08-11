public class Variables {
    public static void main(String[] args) {

        // =============================================
        // 1. BASIC VARIABLE DECLARATIONS
        // =============================================
        // Variables store data in memory with specific data types

        int wholeNumber = 123; // Integer (whole numbers)
        String text = "Sahil Nadaf"; // String (text)
        Double Numberpoint = 3.14121212; // Double (decimal numbers, high precision)
        float NumberCharacter = 3.14f; // Float (decimal numbers, lower precision - needs 'f')
        boolean IsStudent = true; // Boolean (true/false)

        System.out.println("Is Student: " + IsStudent);

        // =============================================
        // 2. VARIABLE MODIFICATION & OPERATORS
        // =============================================
        int a = 10;

        a = 98; // Change the value
        a++; // Increment by 1 (a becomes 99)
        a += 90; // Add 90 to current value (a becomes 189)

        // More shorthand operators
        int x = 10;
        x += 3; // x = x + 3 → 13
        x -= 2; // x = x - 2 → 11
        x *= 2; // x = x * 2 → 22
        x /= 2; // x = x / 2 → 11
        x %= 3; // x = x % 3 → 2 (remainder)

        System.out.println("Final value of a: " + a);

        // =============================================
        // 3. PRINTING MULTIPLE VARIABLES
        // =============================================
        String Name = "Sahil Nadaf";
        int age = 21;
        Double weight = 75.5;
        boolean isStudent = true;

        // Concatenating strings and variables
        System.out.println("My name is " + Name +
                ", Age is " + age +
                ", Weight is " + weight +
                ", Is Student: " + isStudent);

        // =============================================
        // 4. FINAL KEYWORD (CONSTANTS)
        // =============================================
        // 'final' makes a variable constant - value cannot be changed
        final double PI = 3.1415;
        // PI = 3.1767; // ❌ This would cause an error - cannot change final variable
        System.out.println("PI (constant): " + PI);

        // =============================================
        // 5. TYPE CASTING
        // =============================================
        // Converting one data type to another

        // IMPLICIT CASTING (Widening) - Automatic conversion
        // Smaller type → Larger type (no data loss)
        int num = 100;
        double bignum = num; // int automatically converts to double
        System.out.println("Implicit casting (int to double): " + bignum);

        // EXPLICIT CASTING (Narrowing) - Manual conversion
        // Larger type → Smaller type (potential data loss)
        double price = 99.99;
        int pricenow = (int) price; // Explicitly cast double to int (loses decimal part)
        System.out.println("Explicit casting (double to int): " + pricenow);

        // =============================================
        // 6. DECLARING MULTIPLE VARIABLES
        // =============================================
        int q = 10, w = 20, e = 30;

        // IMPORTANT: String concatenation order matters
        System.out.println("Multiple values (concatenated): " + q + w + e); // Output: 102030 (as string)
        System.out.println("Multiple values (sum): " + (q + w + e)); // Output: 60 (calculated first)
        System.out.println((q + w + e) + " Multiple values"); // Output: 60 Multiple values

        // =============================================
        // 7. NULL VALUES
        // =============================================
        // null represents no value (only for non-primitive types)
        String MiddleName = null;
        System.out.println("Middle Name: " + MiddleName); // Output: null

        // =============================================
        // 8. IF-ELSE STATEMENT (COMMENTED EXAMPLE)
        // =============================================
        /*ṇ
         * boolean isStudy = true;
         * if (isStudy == true) { // Note: Use == for comparison, not =
         * System.out.println("Student is studying");
         * } else {
         * System.out.println("Student is not studying");
         * }
         */

    } // end of main method
} // end of Variables class