import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int totalNumbers = 0;
    int individualRange = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the integer upto which you want to write the multiplication table for:\n");
    totalNumbers = sc.nextInt();
    System.out.println("For one table, till what integer do you want to display the table?\n");
    individualRange = sc.nextInt();
    for (int i =1; i <= totalNumbers; i++){
      for (int j = 0; j <= individualRange; j++){
        System.out.printf("%d * %d = %d\n", i, j, i * j);
      }
      System.out.println("--------------------------\n");
      System.out.println("\n");
    }
  }
}