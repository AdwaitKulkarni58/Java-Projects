class Main {
  public static void main(String[] args) {
    int min1 = 1;
    int min2 = 7;
    int min3 = 100;
    int min4 = 742;
    int min5 = 1000;
    int min6 = 9999;
    int firstDigit = (int)(Math.max((Math.random() * min1), (Math.random() * min2)));
    int secondDigit = (int)(Math.min((Math.random() * min1), (Math.random() * min2)));
    int thirdDigit = (int)(Math.max((Math.random() * min1), (Math.random() * min2)));
    int nextThreeDigits = (int)(Math.max((Math.random() * min3), (Math.random() * min4)));
    int lastFourDigits = (int)(Math.max((Math.random() * min5), (Math.random() * min6)));
    System.out.println("The phone number is:\n");
    System.out.print(firstDigit); 
    System.out.print(secondDigit);
    System.out.print(thirdDigit); 
    System.out.println("-" + nextThreeDigits + "-" + lastFourDigits);
  }
}