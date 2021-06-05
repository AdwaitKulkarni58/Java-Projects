import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    float temp, cel;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the temperature in Fahrenheit\n");
    temp = sc.nextFloat();
    cel = (temp - 32) * 5/9;
    System.out.println("The temperature in Celsius is: " + cel + "C");
  }
}