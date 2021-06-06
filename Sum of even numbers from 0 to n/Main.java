import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int n, sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer greater than 0:\n");
    n = sc.nextInt();
    for (int i = 0; i <= n; i++){
      if (i % 2 == 0){
        sum += i;
      }
    }
    System.out.println("The sum of all the even numbers from 0 to " + n + " (including n) is: " + sum);
  }
}