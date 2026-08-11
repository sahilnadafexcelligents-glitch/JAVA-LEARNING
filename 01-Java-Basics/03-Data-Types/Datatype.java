public class Datatype {
    public static void main(String[] args) {
        
        // ========== INTEGER TYPES (Whole Numbers) ==========
        
        // byte: 1 byte (-128 to 127) - Smallest integer type
        byte small = 120;
        
        // short: 2 bytes (-32,768 to 32,767) - Medium range
        short medium = 30000;
        
        // int: 4 bytes (-2,147,483,648 to 2,147,483,647) - Most common
        int num1 = 10;
        
        // long: 8 bytes (Huge range) - Must end with 'L'
        long large = 99999999999L;
        
        // ========== DECIMAL TYPES (Floating Point) ==========
        
        // float: 4 bytes (6-7 decimal digits) - Must end with 'f'
        float num3 = 3.14f;
        
        // double: 8 bytes (15-16 decimal digits) - Default for decimals
        double num2 = 2.25;
        
        // ========== CHARACTER TYPE ==========
        
        // char: 2 bytes (Single character) - MUST use single quotes ''
        char value = 'A';
        // char value1 = "A"; // ❌ ERROR: Double quotes won't work (that's String)
        
        // ========== BOOLEAN TYPE ==========
        
        // boolean: 1 bit (Only true/false)
        boolean isvalue = true;
        
        // ========== REFERENCE TYPE ==========
        
        // String: Reference type (Sequence of characters) - Uses double quotes ""
        String text = "Sahil Nadaf";
        
        // ========== PRINT ALL ==========
        
        System.out.println("===== INTEGER TYPES =====");
        System.out.println("byte   (1 byte)   : " + small);
        System.out.println("short  (2 bytes)  : " + medium);
        System.out.println("int    (4 bytes)  : " + num1);
        System.out.println("long   (8 bytes)  : " + large);
        
        System.out.println("\n===== DECIMAL TYPES =====");
        System.out.println("float  (4 bytes)  : " + num3);
        System.out.println("double (8 bytes)  : " + num2);
        
        System.out.println("\n===== CHARACTER & BOOLEAN =====");
        System.out.println("char   (2 bytes)  : " + value);
        System.out.println("boolean(1 bit)    : " + isvalue);
        
        System.out.println("\n===== REFERENCE TYPE =====");
        System.out.println("String (variable) : " + text);
        
        // ========== EXTRA: SHOW DIFFERENCE ==========
        System.out.println("\n===== KEY DIFFERENCES =====");
        System.out.println("char uses  'A'  (single quotes)");
        System.out.println("String uses \"Sahil Nadaf\" (double quotes)");
        System.out.println("long ends with L : " + large + "L");
        System.out.println("float ends with f: " + num3 + "f");
    }
}