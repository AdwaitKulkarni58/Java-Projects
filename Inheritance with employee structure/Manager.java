class Manager extends Member{
  String department;

  Manager(String name, int age, double phone, String address, int salary, String department){
    super(name, age, phone, address, salary);
    this.department = department;
  }
}