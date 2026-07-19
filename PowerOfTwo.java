class PowerOfTwo {
    public static void main(String[] args) {

        System.out.println("Powers of 2 up to 1024:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(1 << i);
        }
    }
}
