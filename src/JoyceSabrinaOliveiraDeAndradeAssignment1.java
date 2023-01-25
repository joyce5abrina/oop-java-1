public class JoyceSabrinaOliveiraDeAndradeAssignment1 {


    static final int YEARS_IN_DAYS = 365;
    static final int WEEKS_IN_YEAR = 52;
    static final int DAYS_IN_WEEK = 7;

    public static void main(String[] args) {

        int totalNumberOfDays = 183;
        int years = totalNumberOfDays / YEARS_IN_DAYS;
        int weeks = (totalNumberOfDays % YEARS_IN_DAYS) / DAYS_IN_WEEK;
        int days = (totalNumberOfDays % YEARS_IN_DAYS) % DAYS_IN_WEEK;


        System.out.println("There are " + years + " years " + weeks + " weeks and " + days + "  in  days ");

    }
}

