package Homework3;

public class Figure {

    private static int count;

    public Figure() {
        count++;
    }

    public static void main(String[] args) {
        Figure circle = new Figure();
        Figure triangle = new Figure();
        System.out.println(count);
}
}





