import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class belajar {
    public static void main(String[] args) {
        LocalDate hari = LocalDate.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", Locale.forLanguageTag("id-ID"));
        System.out.println("Hari ini adalah: " + hari.format(fmt)+ ", Saya belajar library di java");
    }
}