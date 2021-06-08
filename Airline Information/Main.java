class Main {
  public static void main(String[] args) {

    //initializing objects
    Flight f1 = new Flight("Lufthansa", 2314, "Paris", "Frankfurt");
    Flight f2 = new Flight("Vistara", 3123, "Mumbai", "Delhi");
    Flight f3 = new Flight("Delta", 6127, "London", "New York");
    Flight f4 = new Flight("Air Canada", 8349, "Delhi", "Vancouver");

    //invoking object methods
    System.out.println("Flight name: " + f1.getName() + " Flight Number: " + f1.getNumber() + " Flight origin: " + f1.getOrigin() + " Flight Destination: " + f1.getDestination());

    System.out.println();

    System.out.println("Flight name: " + f2.getName() + " Flight Number: " + f2.getNumber() + " Flight origin: " + f2.getOrigin() + " Flight Destination: " + f2.getDestination());

    System.out.println();

    System.out.println("Flight name: " + f3.getName() + " Flight Number: " + f3.getNumber() + " Flight origin: " + f3.getOrigin() + " Flight Destination: " + f3.getDestination());

    System.out.println();

    System.out.println("Flight name: " + f4.getName() + " Flight Number: " + f4.getNumber() + " Flight origin: " + f4.getOrigin() + " Flight Destination: " + f4.getDestination());
  }
}