import java.time.*;
import java.time.format.*;

public class Problem3 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        String s1 = date.format(f1);
        String s2 = date.format(f2);
        String s3 = date.format(f3);
    }
}
