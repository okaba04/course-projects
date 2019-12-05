package Homework3;

public class Counter {

    private static int count;

    public Counter() {
        count++;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Counter counter = new Counter();
        }
        System.out.println(count);
    }
}
