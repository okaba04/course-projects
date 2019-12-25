package homework7;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class LibraryReport {

    public void runApp() {
        buildReport();
        searchByDates();
        showData();
    }

    private Map<LocalDate, String> reportToDate = new HashMap<>();

    private void buildReport() {
        reportToDate.put(LocalDate.of(2019, 4, 6), "The Philosopher's Stone");
        reportToDate.put(LocalDate.of(2019, 4, 7), "The Chamber of Secrets");
        reportToDate.put(LocalDate.of(2019, 4, 8), "The Prisoner of Azkaban");
        reportToDate.put(LocalDate.of(2019, 4, 9), "The Order of the Phoenix");
        System.out.println("Library report: " + reportToDate);
    }

    private void searchByDates() {
        String book = reportToDate.get(LocalDate.now());
        if (book == null) {
            System.out.println("No books found");
        } else {
            System.out.println(book);
        }
    }

    private void showData() {
        System.out.println("Dates are: " + reportToDate.keySet());
        System.out.println("Books are: " + reportToDate.values());
    }
}