public class Q43_MinutesToHours {
  public static void main(String[] args) {
    int totalMinutes = 150 ;
    int hours = totalMinutes / 60 ;
    int minutes = totalMinutes % 60;
    System.out.println("Total Minutes : " + totalMinutes);
    System.out.println("Hours         : " + hours);
    System.out.println("Minutes       : " + minutes);
  }
  
}
