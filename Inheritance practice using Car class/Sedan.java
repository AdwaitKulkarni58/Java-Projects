class Sedan extends Car{
  int length;

  Sedan(){
    length = 0;
  }

  Sedan(int speed, double regularPrice, String color, int length){
    super(speed, regularPrice, color);
    this.length = length;
  }

  public double getSalePrice(){
    if (length > 20){
      return (super.regularPrice - 0.05 * super.regularPrice);
    }else{
      return (super.regularPrice - 0.1 * super.regularPrice);
    }
  }
}