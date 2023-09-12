import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public class DateSorter {
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        unsortedDates.sort((date1, date2) -> {
            boolean hasRInMonth1 = hasRInMonth(date1);
            boolean hasRInMonth2 = hasRInMonth(date2);

            if (hasRInMonth1 != hasRInMonth2){
                return hasRInMonth1 ? -1 : 1;
            } else{
                return hasRInMonth1 ? date1.compareTo(date2) : date2.compareTo(date1);
            }
        });

        return unsortedDates;
    }

    // функц≥€ дл€ перев≥рки дати на букву "r"
    private boolean hasRInMonth(LocalDate date){
        int month = date.getMonthValue();
        // м≥с€ц≥ з 5 по 8 не мають букви
        return (month < 5 || month > 8);
    }
}
