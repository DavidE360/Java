import java.time.*;
public class TenThousandDaysOld {
    public static void main(String[] args) {
        // Write your code here
        LocalDate myAge = LocalDate.of(2000,1,1);
        myAge = myAge.plusDays(10000);
        System.out.println("I will be 10000 days old on "+myAge);
    }
}
