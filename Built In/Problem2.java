import java.time.*;

public class Problem2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 6, 24);
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
    }
}
