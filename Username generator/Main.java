import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int minNum = 10;
    int maxNum = 99;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your first name:\n");
    String firstName = sc.next();
    System.out.println("Enter your last name:\n");
    String lastName = sc.next();
    String firstFiveLetters = lastName.substring(0, 5);
    String firstLetter = firstName.substring(0, 1);
    int randomInteger = (int)(Math.max((Math.random() * minNum), (Math.random() * maxNum)));
    System.out.println(firstLetter + firstFiveLetters + randomInteger);
  }
}