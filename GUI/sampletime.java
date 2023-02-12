package GUI;


import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class sampletime {
   public static void main(String args[]) {
      //Getting the current date-time value
      LocalDate date = LocalDate.now();
      System.out.println("Current date-time: "+date);
      //Getting the time from LocalDateTime object
      LocalDateTime currentTime = LocalDateTime.now();
      DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm");

      System.out.println("Current time:"+currentTime.format(f));
   }
}

