public class Arrays {
    public static void main(String[] args) {
        int[] Arr = { 10, 20, 30, 40, 50 };
        int sum = 0;
        int n;

        for (int i = 1; i < Arr.length; i++) {
            int Value = Arr[i];
            sum = sum + Value;
            // If We Sout Here Always It Will Loop Here
        }

        System.out.println(sum); // Here It Dos not loop Here
    }
}