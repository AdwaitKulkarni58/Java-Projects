class Member{
  String name;
  int age;
  double phone;
  String address;
  int salary;

  Member(String name, int age, double phone, String address, int salary){
    this.name = name;
    this.age = age;
    this.phone = phone;
    this.address = address;
    this.salary = salary;
  }

  public void printSalary(){
    System.out.println("The salary is " + salary);
  }

  public void determineEligibility(){
    if (age > 18 && age < 25){
      System.out.println("You can work as an intern");
    }else if (age > 25 && age < 45){
      System.out.println("You can work full-time");
    }else{
      System.out.println("Sorry, you are not eligible to work");
    }
  }
}