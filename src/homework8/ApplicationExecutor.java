package homework8;

import homework8.functional.CustomInterface;
import homework8.users.UsersFiltering;
import homework8.movies.MoviesProcessing;


public class ApplicationExecutor {

    public static void runProgram() {
        System.out.println("TASK 1");
        CustomInterface length = (String str) -> str.length();
        System.out.println(length.getStringLength("Hello" + "World"));
        System.out.println("\nTASK 2");
        new UsersFiltering().filterUsersByLoginDate();
        System.out.println("\nTASK 3");
        new MoviesProcessing().calculateAveragePriceByGenre();
    }
}
