class Main {
  public static void main(String[] args) {
    int a;
    int b;
    int c;
    int min = 1;
    int max = 9;
    a = (int)(Math.max((Math.random() * min), (Math.random() * max)));
    b = (int)(Math.max((Math.random() * min), (Math.random() * max)));
    c = (int)(Math.max((Math.random() * min), (Math.random() * max)));
    System.out.print(a);
    System.out.print(b);
    System.out.print(c);
    System.out.println();
    if(a == b && b ==c && c == a){
      System.out.println("All three numbers are same.");
    }else if (a != b && b != c && c != a){
      System.out.println("No two numbers are the same.");
    }else{
      System.out.println("Two numbers from the three are same.");
    }
  }
}