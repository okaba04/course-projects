package homework8;

import homework8.task2.UsersProcessing;
import homework8.task3.MoviesProcessing;


public class ApplicationExecutor {

    public static void runProgram() {
        System.out.println("TASK 1");
        System.out.println("\nTASK 2");
        new UsersProcessing().filterUsersByLoginDate();
        System.out.println("\nTASK 3");
        new MoviesProcessing().calculateAveragePriceByGenre();
        }

    }

