package co.develhope.introduction;

import java.time.Year;
import  java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class DateTime {
    public static void main(String[] args)
    {
    //Find the number days that are left till the end of the month
        LocalDate today = LocalDate.now();
        LocalDate endOfMonth = today.withDayOfMonth(today.lengthOfMonth());
        long daysBetween = ChronoUnit.DAYS.between(today, endOfMonth);
        System.out.println("Number of days left till the end of the month = " + daysBetween);

        //Find the number days that are left till the end of the year
        LocalDate endOfYear = today.withDayOfYear(today.lengthOfYear());
        long daysLeft = ChronoUnit.DAYS.between(today, endOfYear);
        System.out.println("Number of days left till the end of the month = " +  daysLeft);



    }
}
