package homework9;

import homework9.variousexceptions.ExceptionExecutor;
import homework9.division.SafeDivision;
import homework9.rethrowing.ExceptionsRethrowing;

public class AppExecutor {

    public static void runProgram() {
        new ExceptionExecutor().catchAllExceptions();
        new SafeDivision().runApplication();
        System.out.println("\nTASK3");
        ExceptionsRethrowing.throwAllExceptions();
    }
}

