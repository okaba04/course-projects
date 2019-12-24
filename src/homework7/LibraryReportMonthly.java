package homework7;

import java.time.LocalDate;
import java.util.*;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class LibraryReportMonthly {

    private MultiValuedMap<LocalDate, String> monthlyReportToDate = new ArrayListValuedHashMap<>();

    //method to build date range
    private static List<LocalDate> getDaysBetweenDates(Date startDate, Date endDate) {
        List<LocalDate> dates = new ArrayList<>();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        while (calendar.getTime().before(endDate)) {
            LocalDate result = LocalDate.of(calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MONTH),
                    calendar.get(Calendar.DAY_OF_MONTH));
            dates.add(result);
            calendar.add(Calendar.DATE, 1);
        }
        return dates;
    }

    public void buildReport() {
        monthlyReportToDate.put(LocalDate.of(2019, 4, 2), "The Philosopher's Stone");
        monthlyReportToDate.put(LocalDate.of(2019, 4, 2), "Duna");
        monthlyReportToDate.put(LocalDate.of(2019, 4, 7), "The Chamber of Secrets");
        monthlyReportToDate.put(LocalDate.of(2019, 4, 8), "The Prisoner of Azkaban");
        monthlyReportToDate.put(LocalDate.of(2019, 4, 8), "The Order of the Phoenix");
        monthlyReportToDate.put(LocalDate.of(2019, 4, 15), "The Silent Patient");
        monthlyReportToDate.put(LocalDate.of(2019, 4, 20), "The Handmaid's Tale");
        monthlyReportToDate.put(LocalDate.of(2019, 4, 25), "Daisy Jones & The Six");
        monthlyReportToDate.put(LocalDate.of(2019, 4, 30), "The Witch");
        monthlyReportToDate.put(LocalDate.of(2019, 4, 30), "City of Girls");
        monthlyReportToDate.put(LocalDate.of(2019, 4, 30), "Ninth House");

        GregorianCalendar calendar = new GregorianCalendar(2019, 4, 1);
        Date startDate = calendar.getTime();
        GregorianCalendar calendar1 = new GregorianCalendar(2019, 4, 31);
        Date endDate = calendar1.getTime();

        List<LocalDate> range = getDaysBetweenDates(startDate, endDate);
        for (LocalDate aRange : range) {
            int counter = monthlyReportToDate.get(aRange).size();
            System.out.println(aRange + " - " + counter);
        }
    }
}






