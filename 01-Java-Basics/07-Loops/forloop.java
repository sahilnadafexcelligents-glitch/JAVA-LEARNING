public class forloop {
    public static void main(String[] args) {

       /*  for (int i = 0; i <= 10; i++) { // For looping plus
            System.out.println(i);
        }

        for (int i = 10; i >= 0; i--) { // To Start From minus from certain Number
            System.out.println(i);
        }

        for (int i = 2; i <= 20; i++) { // To Start From Middle Any Number
            System.out.println(i);
        } */

        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum = sum + 5;
        }
        System.out.println(sum); // Remember Certain Condition Have To be print OutSide Of loop
    }
}