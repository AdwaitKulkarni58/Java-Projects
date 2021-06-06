import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String str;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string without any spaces:\n");
    str = sc.next();
    for (int i = 0; i <str.length(); i++){
      System.out.println(str.charAt(i));
    }
  }
}