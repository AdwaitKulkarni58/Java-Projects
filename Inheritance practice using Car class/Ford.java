class Ford extends Car{
  int year;
  int manufacturerDiscount;

  Ford(){
    year = 0;
    manufacturerDiscount = 0;
  }

  Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount){
    superclass(speed, regularPrice, color, year);
    this.manufacturerDiscount = manufacturerDiscount;
  }

  public double getSalePrice(){
    return (super.regularPrice - manufacturerDiscount);
  }
}