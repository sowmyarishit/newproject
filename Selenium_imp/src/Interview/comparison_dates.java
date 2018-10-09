package Interview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class comparison_dates {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		/*Date objDate = new Date();
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dat=   inputFormat.format(objDate);
        System.out.println(dat);*/
        SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
        Date dt_1 = objSDF.parse("20-08-1982");
        Date dt_2 = objSDF.parse("20-08-1981");
        //objSDF.parse("20-08-1981");

        System.out.println("Date1 : " + objSDF.format(dt_1));
        System.out.println("Date2 : " + objSDF.format(dt_2));

        if (dt_1.compareTo(dt_2) > 0) {
         System.out.println("Date 1 occurs after Date 2");
        } // compareTo method returns the value greater than 0 if this Date is after the Date argument.
        else if (dt_1.compareTo(dt_2) < 0) {
         System.out.println("Date 1 occurs before Date 2");
        } // compareTo method returns the value less than 0 if this Date is before the Date argument;
        else if (dt_1.compareTo(dt_2) == 0) {
         System.out.println("Both are same dates");
        } // compareTo method returns the value 0 if the argument Date is equal to the second Date;
        else {
         System.out.println("You seem to be a time traveller !!");
        }

	}

}
