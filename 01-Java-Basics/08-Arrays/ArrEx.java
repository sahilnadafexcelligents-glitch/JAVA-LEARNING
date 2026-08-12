public class ArrEx {
    public static void main(String[] args) {

        int sum = 0;

        int[] fruits = new int[6];
        fruits[0] = 10;
        fruits[1] = 20;
        fruits[2] = 90;
        fruits[3] = 50;
        fruits[4] = 90;
        fruits[5] = 80;

        for (int num : fruits) {
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
