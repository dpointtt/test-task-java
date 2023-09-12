import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LocalDate> unsortedDates = new ArrayList<>();
        unsortedDates.add(LocalDate.of(2005, 7, 1));
        unsortedDates.add(LocalDate.of(2005, 2, 1));
        unsortedDates.add(LocalDate.of(2005, 4, 1));
        unsortedDates.add(LocalDate.of(2005, 1, 1));
        unsortedDates.add(LocalDate.of(2005, 1, 1));
        unsortedDates.add(LocalDate.of(2005, 5, 1));
        unsortedDates.add(LocalDate.of(2005, 8, 1));

        DateSorter sorter = new DateSorter();

        for (LocalDate date : sorter.sortDates(unsortedDates)){
            System.out.println(date);
        }
    }
}