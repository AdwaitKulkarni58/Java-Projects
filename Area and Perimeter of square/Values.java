public class Values{
  float side;

  Values(float side){
    this.side = side;
  }

  public float calculateArea() {
      return (this.side * this.side);
    }

  public float calculatePerimeter() {
      return (4*this.side);
    }
}