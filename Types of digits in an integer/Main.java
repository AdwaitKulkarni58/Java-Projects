import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int num = 0; 
    int rem = 0;
    int oddCount = 0;
    int evenCount = 0;
    int zeroCount = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the integer:\n");
    num = sc.nextInt();
    while (num != 0)
    {
       rem = num % 10;
       if (rem == 0)
       {
         zeroCount++;
       }else if (rem % 2 != 0)
       {
         oddCount++;
       }else
       {
         evenCount++;
       }
       num = num / 10;
    }
    System.out.println("Total even digits are: " + evenCount);
    System.out.println("Total odd digits are: " + oddCount);
    System.out.println("Total number of zeroes are: " + zeroCount);
  }
}