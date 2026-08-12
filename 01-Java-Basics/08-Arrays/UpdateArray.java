public class UpdateArray {
    public static void main(String[] args) {

        int sum = 0;
        int[] ages = { 20, 30, 40, 50 };
        ages[0] = 100; // Value Updated

        for (int age : ages) {
            sum = sum + age;
            System.out.println(sum); // It Show Loop Sum
        }
        
        System.out.println(sum); // It Show Final Sum
    }
}