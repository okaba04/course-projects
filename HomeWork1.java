import java.util.Random;

public class HomeWork1 {

    public static void main(String[] args) {
        Random number = new Random();
        byte firstByte = 50;
        byte secondByte = 100;
        short firstShort = (short) number.nextInt(Short.MAX_VALUE+1);
        short secondShort = (short) number.nextInt(Short.MAX_VALUE+1);
        double firstDouble = number.nextDouble();
        double secondDouble = number.nextDouble();
        float firstFloat = number.nextFloat();
        float secondFloat = number.nextFloat();
        long firstLong = number.nextLong();
        long secondLong = number.nextLong();

        System.out.println(firstByte + " + " + secondByte + " = " + (firstByte + secondByte));
        System.out.println(firstShort + " - " + secondShort + " = " + (firstShort - secondShort));
        System.out.println(firstDouble + " * " + secondDouble + " = " + firstDouble * secondDouble);
        System.out.println(firstFloat + " / " + secondFloat + " = " + firstFloat / secondFloat);
        System.out.println(firstLong + " + " + secondLong + " = " + (firstLong + secondLong));
    }
}
