public class StringComparing {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println(a == b); // true (same object in String Pool)
        System.out.println(a == c); // false (different objects)
        System.out.println(a.equals(c)); // true (same content)
        System.out.println(a.equalsIgnoreCase("java")); // true
    }

}
