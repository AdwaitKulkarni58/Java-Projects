import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n");
    n = sc.nextInt();
    while (n != 1){
      if (n % 2 == 0){
        n = n / 2;
        System.out.println(n);
      }else if(n % 2 == 1){
        n = 3 * n + 1;
        System.out.println(n);
      }
    }
  }
}