import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.parse("2006-06-28");
        LocalDateTime dateTime = LocalDateTime.parse("2020-07-17T08:20");
        Instant dateInst = Instant.parse("2020-08-22T08:00:20Z");

        LocalDateTime date = LocalDateTime.ofInstant(dateInst, ZoneId.of("America/Sao_Paulo"));
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println(date);
        System.out.println(dateTime.format(fmt));
    }
}
