package B15.EntitiesManager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Validator {
    public static boolean isValidFullName(String fullName) {
        return fullName.length() >= 10 && fullName.length() <= 50;
    }

    public static boolean isValidDOB(String doB) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        try {
            Date date = dateFormat.parse(doB);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            // Check for invalid day
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            if (day < 1 || day > 31) {
                return false;
            }

            // Check for invalid month
            int month = calendar.get(Calendar.MONTH) + 1; // Month starts from 0 in Calendar
            if (month < 1 || month > 12) {
                return false;
            }

            // Check for invalid year
            int year = calendar.get(Calendar.YEAR);
            if (year < 1900 || year > 2100) {
                return false;
            }

            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static boolean isValidYearOfEntry(int yearOfEntry) {
        return yearOfEntry >= 2000 && yearOfEntry <= 2023;
    }
}
