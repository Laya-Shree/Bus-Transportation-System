package GUI;
import java.util.Calendar;
// import java.util.Date;
// import java.sql.*;
// import java.time.LocalDateTime;
// import java.time.LocalDate;


public class trialDelete {
    public static void main(String args[]){
        int noSem = 1;
        Calendar cal = Calendar.getInstance();
        // int prevMonth = 0;
        int month = cal.get(Calendar.MONTH) + 1;
        int yr = cal.get(Calendar.YEAR);
        String endDate = "";
        //int date = cal.get(Calendar.DATE);
        // LocalDate date = LocalDate.now();
		// Displaying date
		// System.out.println("Date : "+date);
		// Add 1 month to the date
		// LocalDate newDate = date.plusYears(1); 
		// LocalDate newDay = date.plusMonths(1); 
		// System.out.println("New Date : "+newDate);

        if(month>=1 && month<=5)
        {
            if(noSem == 1){ endDate = "31-05-"+yr;}
            else{endDate = "31-12-"+yr;}
        }
        else{
            if(noSem == 1){endDate = "31-12-"+yr;}
            else
            {
                yr = yr+1;
                endDate = "31-05-"+yr;
            }
        }
        System.out.println(endDate);
        String date = "08-05-2023";
        if(date == (java.time.LocalDate.now()).toString()){
            System.out.println("YEss!!");
        }
    }
}
