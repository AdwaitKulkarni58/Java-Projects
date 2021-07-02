class Main {
  public static void main(String[] args) {
    Movable m1 = new Ball();
    Bounceable b1 = new Ball();
    Movable m2 = new Car();
    m1.move();
    b1.bounce();
    m2.move();
  }
}