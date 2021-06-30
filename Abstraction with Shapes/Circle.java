class Circle extends Shape{
  int radius;
  final float pi = 3.142f;

  Circle(){
    radius = 0;
  }

  Circle(int radius){
    this.radius = radius;
  }

  public void area(){
    System.out.println(pi * radius * radius);
  }
}