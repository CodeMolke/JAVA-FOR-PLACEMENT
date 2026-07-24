public class Q28_ConvertDaysToYearsMonthsDays {
  public static void main(String[] args) {
    int totaldays = 800;
    int year = totaldays / 365;
    int remainingDays = totaldays - (year * 365);
    int months = remainingDays / 30;
    int days = remainingDays % 30;
    System.out.println("Total Days  : " + totaldays);
    System.out.println("Year        : " + year);
    System.out.println("Months      : " + months);
    System.out.println("Days        : " + days);
  }

}
