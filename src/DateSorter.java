import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DateSorter {
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        return new ArrayList<>();
    }

    // функц≥€ дл€ перев≥рки дати на букву "r"
    private boolean hasRInMonth(LocalDate date){
        int month = date.getMonthValue();
        // м≥с€ц≥ з 5 по 8 не мають букви
        return (month < 5 || month > 8);
    }
}
