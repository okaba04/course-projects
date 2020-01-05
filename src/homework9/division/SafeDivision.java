package homework9.division;

import java.util.Scanner;

public class SafeDivision {

    private int numberA;
    private int numberB;
    private Scanner scanner = new Scanner(System.in);

    public void runApplication() {
        System.out.println("\nTASK2");
        enterNumberA();
        enterNumberB();
        divideTwoNumbers();
    }

    private void enterNumberA() {
        System.out.print("Enter the number A: ");
        numberA = scanner.nextInt();
    }

    private void enterNumberB() {
        System.out.println("Enter the number B: ");
        numberB = scanner.nextInt();
    }

    private void divideTwoNumbers() {
        try {
            int result = numberA / numberB;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero, reenter the value of B");
            enterNumberB();
            divideTwoNumbers();
        }
    }
}
