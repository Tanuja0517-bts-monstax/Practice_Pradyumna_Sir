package practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GenerateDate {
	public static void main(String[] args) {
		Date d=new Date();
		SimpleDateFormat sDate=new SimpleDateFormat("yyyy-MM-dd");
		String date=sDate.format(d);
		
		System.out.println("Simple Date Format:"+date);
		
		Calendar cal=sDate.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, 30);
		
		String dateReq=sDate.format(cal.getTime());
		
		System.out.println(dateReq);
	}
}
