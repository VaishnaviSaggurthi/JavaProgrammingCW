package JavaDateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTimeFormatterClass {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj); // YYYY-MM-DDT:HH:MM:SS
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate); // dd/MM/yyyy HH:mm:ss
        // E, MMM dd yyyy --> Mon,Sep 11 2023
        // dd-MMM-yyyy --> 11-Sep-2023
    }
}
