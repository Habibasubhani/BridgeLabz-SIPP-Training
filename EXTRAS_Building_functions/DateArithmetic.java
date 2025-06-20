package LocalRepo.EXTRAS_Building_functions;

import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 6, 20);
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Final Date: " + modifiedDate);
    }
}

