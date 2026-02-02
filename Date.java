package Tasks;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Date {
  public static void main(String[] args) {
	  DateTimeFormatter formatter =
		        DateTimeFormatter.ofPattern("dd-MM-yyyy \nhh:mm");

	  System.out.print(LocalDateTime.now().format(formatter));
  }
}
