package homework9;

import homework9.task1.ExceptionExecutor;
import homework9.task2.SafeDivision;
import homework9.task3.ExceptionsRethrowing;

public class AppExecutor {

    public static void runProgram() {
        new ExceptionExecutor().catchAllExceptions();
        new SafeDivision().runApplication();
        System.out.println("\nTASK3");
        ExceptionsRethrowing.throwAllExceptions();
    }
}

