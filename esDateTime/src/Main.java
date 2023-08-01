/*Using LocaleDate or another Date class calculate and print:
How many days are left till the end of the month
How many days are left till the end of the year, using the length() method from
java.time.Year.of()
 */

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        int remaningDays = today.lengthOfMonth() - today.getDayOfMonth();

        System.out.println("Remaning days of the month : " + remaningDays);

        LocalDate lastDayofTheYear = LocalDate.of(today.getYear() , 12 ,31);

        int remaningDaysYear = lastDayofTheYear.getDayOfYear() - today.getDayOfYear();

        System.out.println("Remaning days of the year : " + remaningDaysYear);
    }
}