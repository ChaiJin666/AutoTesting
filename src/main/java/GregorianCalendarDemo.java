import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo {
    public static void main(String args[]){
        String months[] ={
                "Jan","Feb","Mar","Apr","May","Jun",
                "Jul","Aug","Sep","Oct","Nov","Dec"};
        int year;
        GregorianCalendar gcalendar =new GregorianCalendar();
        System.out.print("Date:");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" "+gcalendar.get(Calendar.DATE)+" ");
        System.out.print(year = gcalendar.get(Calendar.YEAR));
        System.out.print("Time:");
        System.out.print(gcalendar.get(Calendar.HOUR)+":");
        System.out.print(gcalendar.get(Calendar.MINUTE)+":");
        System.out.print(gcalendar.get(Calendar.SECOND));

        //测试当前年份是否为闰年
        if(gcalendar.isLeapYear(year)){
            System.out.println("当前年份是闰年");
        }
        else{
            System.out.println("当前年份不是闰年");
        }
    }
}
