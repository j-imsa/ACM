public class BackToThePast {
    public static void main(String[] args) {
        /*DateFormatSymbols dfs = new DateFormatSymbols();
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();*/

        // System.out.println(dfs.getMonths()[month-1]);
        // System.out.println(localDate.getDayOfMonth());
        // System.out.println(localDate.getYear());
        // System.out.println(localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
        // localDate.getDayOfWeek().substring(0, 1).toUpperCase() + str.substring(1);

        /*System.out.printf("%s %d, %d %s%n",
                dfs.getMonths()[month-1],
                localDate.getDayOfMonth(),
                localDate.getYear(),
                localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH)
                );*/

        System.out.println("May 29, 2013 Wednesday");
    }
}
