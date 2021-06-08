class Ford extends Car{
  private int year;
  private int manufacturerDiscount;

  Ford(){
    year = 0;
    manufacturerDiscount = 0;
  }

  Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount){
    superclass(speed, regularPrice, color);
    this.year = year;
    this.manufacturerDiscount = manufacturerDiscount;
  }

  public double getSalePrice(){
    return (super.getSalePrice() - manufacturerDiscount);
  }
}
