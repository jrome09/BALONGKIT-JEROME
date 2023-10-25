import java.time.*;
public class DaystiNextMonth{
 public static void main(String[] a){
 LocalDate day = LocalDate.now();
 int month = day.getDayOfMonth();
 int daysinmonth = day.lengthOfMonth();
 int year = day.getYear();
 String Month = "October";
   System.out.println(Month +" "+   month +" " + year);
 

 }
}