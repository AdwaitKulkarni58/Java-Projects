class Car{
  int speed;
  double regularPrice;
  String color;

  public Car(){
    speed = 0;
    regularPrice = 0;
    color = "";
  }

  public Car(int speed, double regularPrice, String color){
    this.speed = speed;
    this.regularPrice = regularPrice;
    this.color = color;
  }

  public double getSalePrice(){
    return regularPrice;
  }
}