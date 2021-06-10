class Main {
  public static void main(String[] args) {
    Parent p = new Parent();
    Child c = new Child();
    p.parentMethod(); //parent class object accessing parent class method
    c.childMethod(); //child class object accessing child class method
    c.parentMethod(); //child class object accessing parent class method (base of inheritance)
    //Writing p.childMethod(); here will give error as parent class methods can't access its child class methods. 
  }
}