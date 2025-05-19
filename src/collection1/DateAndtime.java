package collection1;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.time.LocalDateTime;

 
public class DateAndtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LocalDate date = LocalDate.now();
    System.out.println(date);
    
    LocalTime time = LocalTime.now();
    System.out.println(time);
    
    LocalDateTime locdatetime = LocalDateTime.now();
    System.out.println(locdatetime);
    
    DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
        
    
    
	}

}
