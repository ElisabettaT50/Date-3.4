import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
aggiungi un anno
sottrai un mese
aggiungi 7 giorni
Stampa il risultato localizzata per l'Italia
 */
public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.of(2023,3,1,13,0,0,0, ZoneOffset.UTC);
        OffsetDateTime newDateTime1 = dateTime.plusYears(1);
        OffsetDateTime newDateTime2 = newDateTime1.minusMonths(1);
        OffsetDateTime newDateTime3 = newDateTime2.plusDays(7);

        String newDateTime4 = newDateTime3.format(DateTimeFormatter.ofPattern("EEEE, dd, MMMM, yyyy, hh, mm", Locale.ITALY));
        //ofLocalizedDateTime(FormatStyle.FULL).localizedBy(Locale.ITALY));
        //String formattedDateTime = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).localizedBy(Locale.ITALY));

        System.out.println(newDateTime1);
        System.out.println(newDateTime2);
        System.out.println(newDateTime3);
        System.out.println(newDateTime4);
    }
}