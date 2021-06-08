import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int month, day, year;
    Scanner sc = new Scanner(System.in);
    Date d = new Date();

    System.out.println("Enter the day:");
    day = sc.nextInt();
    d.setDay(day);

    System.out.println("Enter the month:");
    month = sc.nextInt();
    d.setMonth(month);
    
    System.out.println("Enter the year:");
    year = sc.nextInt();
    d.setYear(year);

    d.displayDate();
  }
}