class Main {
  public static void main(String[] args) {
    MyDate d1 = new MyDate(2, 3, 2002);
    MyDate d2 = new MyDate(2, 3, 2002);
    if (d1.equals(d2)){
      System.out.println("Same dates");
    }
    else{
      System.out.println("Different dates");
    }
  }
}