package B13.EntitiesManager;

import B13.Exceptions.BirthdayException;
import B13.Exceptions.EmailException;
import B13.Exceptions.FullNameException;
import B13.Exceptions.PhoneException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Validator {
    public static void nameCheck(String name) throws FullNameException {
        // Validate name using a regular expression
        String regex = "^[a-zA-Z\\s]+$";

        if (!name.matches(regex)) {
            throw new FullNameException("Invalid name format");
        }
    }

    public static void birthdayCheck(String birthday) throws BirthdayException {
        try {
            LocalDate parsedBirthday = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            // Validate day range (1-31)
            int day = parsedBirthday.getDayOfMonth();
            if (day < 1 || day > 31) {
                throw new BirthdayException("Invalid day");
            }

            // Validate month range (1-12)
            int month = parsedBirthday.getMonthValue();
            if (month < 1 || month > 12) {
                throw new BirthdayException("Invalid month");
            }

            // Validate year range (e.g., you can define a valid range specific to your requirements)
            int year = parsedBirthday.getYear();
            if (year < 1900 || year > 2100) {
                throw new BirthdayException("Invalid year");
            }
        } catch (DateTimeParseException e) {
            throw new BirthdayException("Invalid date format");
        }
    }

    public static void phoneCheck(String phone) throws PhoneException {
        // Remove any non-digit characters from the phone number
        String cleanedPhone = phone.replaceAll("\\D", "");

        // Validate the cleaned phone number
        if (cleanedPhone.length() != phone.length()) {
            throw new PhoneException("Phone number can only contain digits");
        }

        if (cleanedPhone.length() != 10) {
            throw new PhoneException("Invalid phone number length");
        }

        if (!cleanedPhone.matches("\\d{10}")) {
            throw new PhoneException("Invalid phone number format");
        }
    }

    public static void emailCheck(String email) throws EmailException {
        // Validate email format using a regular expression
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (!email.matches(regex)) {
            throw new EmailException("Invalid email format");
        }
    }
}

