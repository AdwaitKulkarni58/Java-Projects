public class MyOwnAutoShop {
  (int speed, double regularPrice, String color, int year, int manufacturerDiscount, int length, int weight);
  public static void main(String[] args) {
    Sedan s = new Sedan(100, 1000.00, "black", 5);
    Ford f1 = new Ford(120, 1200.00, "red", 2002, 4);
    Ford f2 = new Ford(140, 1400.00, "silver", 2004, 6);
    Car c = new Car(130, 1300.00, "blue");
    System.out.println("Sale price of sedan is " + s.getSalePrice());
    System.out.println("Sale price of first Ford is " + f1.getSalePrice());
    System.out.println("Sale price of second Ford is " + f2.getSalePrice());
    System.out.println("Sale price of car is " + c.getSalePrice());
  }
}
