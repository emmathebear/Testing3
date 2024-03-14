
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println(dataToItalianLONG("2023-03-01T13:00:00Z"));
    }

    public static String dataToItalianLONG(String dataIso) {
        if (dataIso == null) {
            return null;
        }
        try {
            OffsetDateTime data = OffsetDateTime.parse(dataIso);
            return data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        } catch (Exception e) {
            System.out.println("\n invalid data arguments: " + e);
            return null;
        }
    }
}