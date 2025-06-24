import java.time.*;

public class Problem4 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2023, 5, 1);
        LocalDate d2 = LocalDate.of(2023, 6, 1);
        boolean before = d1.isBefore(d2);
        boolean after = d1.isAfter(d2);
        boolean equal = d1.isEqual(d2);
    }
}
