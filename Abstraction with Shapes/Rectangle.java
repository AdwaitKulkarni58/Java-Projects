class Rectangle extends Shape{
  int length, breadth;
  
  Rectangle(){
    length = 0;
    breadth = 0;
  }

  Rectangle(int length, int breadth){
    this.length = length;
    this.breadth = breadth;
  }

  public void area(){
    System.out.println(length * breadth);
  }
}