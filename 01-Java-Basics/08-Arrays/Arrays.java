public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
       // numbers[5] = 60; // This line will cause an ArrayIndexOutOfBoundsException

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}