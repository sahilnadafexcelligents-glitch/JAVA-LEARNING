public class PasswordChecker {
    public static void main(String[] args) {
        String password = "MySecurePass123";

        if (password.length() < 8) {
            System.out.println("Password Is To Short");
        } else if (!password.contains("Pass")) {
            System.out.println("Password should contain 'Pass'");
        } else {
            System.out.println("Password accepted");
            // In real apps we would hash the password, never store plain text
            String masked = password.substring(0, 3) + "********";
            System.out.println("Stored as: " + masked);
        }
    }
}