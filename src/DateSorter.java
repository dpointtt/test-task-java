import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DateSorter {
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        return new ArrayList<>();
    }

    // ������� ��� �������� ���� �� ����� "r"
    private boolean hasRInMonth(LocalDate date){
        int month = date.getMonthValue();
        // ����� � 5 �� 8 �� ����� �����
        return (month < 5 || month > 8);
    }
}
