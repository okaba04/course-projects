package homework7;

public class AppExecutor {
    public static void executeProgram() {

     new LibraryReport().runApp();
     System.out.println("Task 2: Monthly report");
     new LibraryReportMonthly().buildReport();
    }
}
