import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    float sideLength;
    float area, perim;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of side of the square:\n");
    sideLength = sc.nextFloat();
    Values v = new Values(sideLength);
    area = v.calculateArea();
    perim = v.calculatePerimeter();
    System.out.println("The area of square is: " + area);
    System.out.println("The perimeter of square is: " + perim);
  }
}