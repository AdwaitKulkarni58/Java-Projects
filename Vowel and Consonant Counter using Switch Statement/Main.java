import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String str;
    int acount = 0;
    int ecount = 0;
    int icount = 0;
    int ocount = 0;
    int ucount = 0;
    int consonantCount = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string:\n");
    str = sc.next();
    for (int i = 0; i < str.length(); i++){
      switch(str.charAt(i)){
        case 'a':
        acount++;
        break;

        case 'e':
        ecount++;
        break;

        case 'i':
        icount++;
        break;

        case 'o':
        ocount++;
        break;

        case 'u':
        ucount++;
        break;
      }
    }
    consonantCount = str.length() - (acount + ecount + icount + ocount + ucount);
    System.out.println("A count is: " + acount);
    System.out.println("E count is: " + ecount);
    System.out.println("I count is: " + icount);
    System.out.println("O count is: " + ocount);
    System.out.println("U count is: " + ucount);
    System.out.println("The consonant count is: " + consonantCount);
  }
}