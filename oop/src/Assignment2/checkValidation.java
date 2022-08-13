package Assignment2;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



@SuppressWarnings("serial")
public class checkValidation extends Exception{
	 public static Scanner sc = new Scanner(System.in);
	
	public static String regexEmail = "^[A-Za-z].*?@gmail\\.com$";
	
    public static boolean isValidcheckEmail(String Email){	
	return Email != null && Email.matches(regexEmail);
   
 }
	
	
 static boolean isValidDate(String BirthDay) {
 	
    if (BirthDay == null || !BirthDay.matches("\\d{4}-[01]\\d-[0-3]\\d"))
        return false;
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    df.setLenient(false);
    try {
        df.parse(BirthDay);
        return true;
    } catch (ParseException ex) {
        return false;
    }
}
 private static  String PHONE_NUMBER_REGEX = "^(0)(2|3|9)(\\d{8})$";
public static boolean isValidatePhoneNumber(String Phone) {

	return Phone != null && Phone.matches(PHONE_NUMBER_REGEX); 

}
}
