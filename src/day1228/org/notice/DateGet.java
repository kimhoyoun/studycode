package day1228.org.notice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateGet {
	private String date = "";
	LocalDateTime myDateObj = LocalDateTime.now();
	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	public DateGet(){
		setDate(myDateObj.format(myFormatObj));
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
