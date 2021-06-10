import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Employee e = new Employee("xyz", 24, 1234, "abc", 2000, "technician");
    Manager m = new Manager("pqr", 34, 5678, "uvw", 4000, "assistant");

    e.printSalary();
    e.determineEligibility();
    
    m.printSalary();
    m.determineEligibility();
  }
}