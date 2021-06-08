class Flight{
  String name;
  int number;
  String origin;
  String destination;

  Flight(String name, int number, String origin, String destination){
    this.name = name;
    this.number = number;
    this.origin = origin;
    this.destination = destination;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setNumber(int number){
    this.number = number;
  }

  public int getNumber(){
    return number;
  }

  public void setOrigin(String origin){
    this.origin = origin;
  }

  public String getOrigin(){
    return origin;
  }

  public void setDestination(String destination){
    this.destination = destination;
  }

  public String getDestination(){
    return destination;
  }

  
}