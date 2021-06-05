import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double a, b, c, root1, root2, delta;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a:\n");
    a = sc.nextInt();
    System.out.println("Enter the value of b:\n");
    b = sc.nextInt();
    System.out.println("Enter the value of c:\n");
    c = sc.nextInt();
    delta = Math.sqrt(b*b - 4*a*c);
    root1 = (-b + delta) / (2*a);
    root2 = (-b - delta) / (2*a);
    System.out.println("The first root is: " + root1);
    System.out.println("The second root is: " + root2);
  }
}