public class Operators {
    public static void main(String[] args) {
        
        System.out.println("========== COMPLETE OPERATORS GUIDE ==========\n");
        
        // ========== 1. ARITHMETIC OPERATORS ==========
        System.out.println("1. ARITHMETIC OPERATORS:");
        System.out.println("   Used for mathematical calculations");
        
        int a = 100;
        int b = 30;
        
        System.out.println("   a = " + a + ", b = " + b);
        System.out.println("   a + b = " + (a + b));        // Addition
        System.out.println("   a - b = " + (a - b));        // Subtraction
        System.out.println("   a * b = " + (a * b));        // Multiplication
        System.out.println("   a / b = " + (a / b));        // Division (quotient)
        System.out.println("   a % b = " + (a % b));        // Modulus (remainder)
        
        // Increment/Decrement operators
        int x = 5;
        System.out.println("   x++ (post-increment): " + (x++));  // Prints 5, then x becomes 6
        System.out.println("   ++x (pre-increment): " + (++x));   // x becomes 7, then prints 7
        System.out.println("   x-- (post-decrement): " + (x--));  // Prints 7, then x becomes 6
        System.out.println("   --x (pre-decrement): " + (--x));   // x becomes 5, then prints 5
        
        System.out.println("\n");
        
        // ========== 2. ASSIGNMENT OPERATORS ==========
        System.out.println("2. ASSIGNMENT OPERATORS:");
        System.out.println("   Used to assign values to variables");
        
        int num = 50;                                           // Simple assignment
        System.out.println("   num = " + num);
        
        num += 10;  // num = num + 10
        System.out.println("   num += 10  → " + num);
        
        num -= 5;   // num = num - 5
        System.out.println("   num -= 5   → " + num);
        
        num *= 2;   // num = num * 2
        System.out.println("   num *= 2   → " + num);
        
        num /= 4;   // num = num / 4
        System.out.println("   num /= 4   → " + num);
        
        num %= 3;   // num = num % 3
        System.out.println("   num %= 3   → " + num);
        
        System.out.println("\n");
        
        // ========== 3. COMPARISON (RELATIONAL) OPERATORS ==========
        System.out.println("3. COMPARISON (RELATIONAL) OPERATORS:");
        System.out.println("   Used to compare two values (returns boolean)");
        
        System.out.println("   a = " + a + ", b = " + b);
        System.out.println("   a == b  → " + (a == b));    // Equal to
        System.out.println("   a != b  → " + (a != b));    // Not equal to
        System.out.println("   a > b   → " + (a > b));     // Greater than
        System.out.println("   a < b   → " + (a < b));     // Less than
        System.out.println("   a >= b  → " + (a >= b));    // Greater than or equal to
        System.out.println("   a <= b  → " + (a <= b));    // Less than or equal to
        
        System.out.println("\n");
        
        // ========== 4. LOGICAL OPERATORS ==========
        System.out.println("4. LOGICAL OPERATORS:");
        System.out.println("   Used to combine boolean conditions");
        
        boolean condition1 = (a > 50);
        boolean condition2 = (b < 20);
        
        System.out.println("   condition1 (a > 50)  = " + condition1);
        System.out.println("   condition2 (b < 20)  = " + condition2);
        System.out.println("   condition1 && condition2 (AND)  → " + (condition1 && condition2));  // Both true?
        System.out.println("   condition1 || condition2 (OR)   → " + (condition1 || condition2));  // At least one true?
        System.out.println("   !condition1 (NOT)               → " + (!condition1));               // Reverse boolean
        
        System.out.println("\n");
        
        // ========== 5. TERNARY (CONDITIONAL) OPERATOR ==========
        System.out.println("5. TERNARY (CONDITIONAL) OPERATOR:");
        System.out.println("   Shortcut for if-else: condition ? value1 : value2");
        
        int age = 20;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("   Age = " + age + " → " + status);
        
        int max = (a > b) ? a : b;
        System.out.println("   Max of a and b = " + max);
        
        System.out.println("\n");
        
        // ========== 6. BITWISE OPERATORS ==========
        System.out.println("6. BITWISE OPERATORS:");
        System.out.println("   Work on individual bits of numbers");
        
        int p = 12;  // Binary: 1100
        int q = 10;  // Binary: 1010
        
        System.out.println("   p = " + p + " (Binary: " + Integer.toBinaryString(p) + ")");
        System.out.println("   q = " + q + " (Binary: " + Integer.toBinaryString(q) + ")");
        System.out.println("   p & q  (AND)  → " + (p & q) + " (Binary: " + Integer.toBinaryString(p & q) + ")");
        System.out.println("   p | q  (OR)   → " + (p | q) + " (Binary: " + Integer.toBinaryString(p | q) + ")");
        System.out.println("   p ^ q  (XOR)  → " + (p ^ q) + " (Binary: " + Integer.toBinaryString(p ^ q) + ")");
        System.out.println("   ~p     (NOT)  → " + (~p) + " (Binary: " + Integer.toBinaryString(~p) + ")");
        System.out.println("   p << 2 (Left shift)  → " + (p << 2));  // Multiply by 2^2
        System.out.println("   p >> 2 (Right shift) → " + (p >> 2));  // Divide by 2^2
        
        System.out.println("\n");
        
        // ========== 7. INSTANCEOF OPERATOR ==========
        System.out.println("7. INSTANCEOF OPERATOR:");
        System.out.println("   Checks if an object is an instance of a class");
        
        String text = "Hello";
        System.out.println("   text instanceof String → " + (text instanceof String));
        System.out.println("   text instanceof Object → " + (text instanceof Object));
        
        // Integer numObj = 10;
        // System.out.println("   numObj instanceof Integer → " + (numObj instanceof Integer));
        
        System.out.println("\n");
        
        // ========== 8. NEW OPERATOR ==========
        System.out.println("8. NEW OPERATOR:");
        System.out.println("   Used to create objects");
        
        // String str = new String("Java");  // Creates a new String object
        System.out.println("   new String(\"Java\") - Creates a new String object");
        System.out.println("   new int[5] - Creates a new array");
        System.out.println("   new Operators() - Creates a new object of this class");
        
        System.out.println("\n");
        
        // ========== 9. CAST (TYPE CONVERSION) ==========
        System.out.println("9. CAST (TYPE CONVERSION) OPERATOR:");
        System.out.println("   Converts one data type to another");
        
        double decimal = 9.99;
        int integer = (int) decimal;  // Explicit casting (double to int)
        System.out.println("   double 9.99 cast to int → " + integer);
        
        int small = 100;
        long large = small;  // Implicit casting (int to long - automatic)
        System.out.println("   int 100 implicit cast to long → " + large);
        
        System.out.println("\n");
        
        // ========== 10. IF-ELSE (Control Flow) ==========
        System.out.println("10. IF-ELSE STATEMENTS (Control Flow):");
        System.out.println("   Used for decision making");
        
        if (a == 90) {
            System.out.println("   a is equal to 90");
        } else if (a > 90) {
            System.out.println("   a is greater than 90 (a = " + a + ")");
        } else {
            System.out.println("   a is less than 90");
        }
        
        System.out.println("\n");
        
        // ========== 11. SWITCH CASE ==========
        System.out.println("11. SWITCH CASE:");
        System.out.println("   Multi-branch decision making");
        
        int day = 3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("   Day " + day + " is " + dayName);
        
        System.out.println("\n");
        
        // ========== 12. SHIFT OPERATORS (Already covered in Bitwise) ==========
        System.out.println("12. SHIFT OPERATORS (Extra detail):");
        int value = 8;  // Binary: 1000
        System.out.println("   value = " + value);
        System.out.println("   value << 1 (left shift by 1) = " + (value << 1) + " (multiply by 2)");
        System.out.println("   value >> 1 (right shift by 1) = " + (value >> 1) + " (divide by 2)");
        System.out.println("   value >>> 1 (unsigned right shift) = " + (value >>> 1));
        
        System.out.println("\n");
        System.out.println("========== END OF OPERATORS GUIDE ==========");
    }
}