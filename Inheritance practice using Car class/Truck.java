class Truck extends Car{
  int weight;

  Truck(){
    weight = 0;
  }

  Truck(int speed, double regularPrice, String color, int weight){
    super(speed, regularPrice, color);
    this.weight = weight;
  }

  public double getSalePrice(){
    if (weight > 2000){
      return (regularPrice - 0.1 * regularPrice);
    }else{
      return (regularPrice - 0.2 * regularPrice);
    }
  }

}