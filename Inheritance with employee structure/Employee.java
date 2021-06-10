class Employee extends Member{
  String specialization;

  Employee(String name, int age, double phone, String address, int salary, String specialization){
    super(name, age, phone, address, salary);
    this.specialization = specialization;
  }
}
