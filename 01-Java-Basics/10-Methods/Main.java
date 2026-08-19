class Main {
    void checkNumber(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.checkNumber(7);
        obj.checkNumber(12);
    }
}