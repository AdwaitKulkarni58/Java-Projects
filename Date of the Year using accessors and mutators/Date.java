class Date{
  int month;
  int day;
  int year;

  Date(){
    month = 0;
    day = 0;
    year = 0;
  }

  Date(int month, int day, int year){
    this.month = month;
    this.day = day;
    this.year = year;
  }

  public void setMonth(int month){
    this.month = month;
  }

  public int getMonth(){
    return this.month;
  }

  public void setDay(int day){
    this.day = day;
  }

  public int getDay(){
    return this.day;
  }

  public void setYear(int year){
    this.year = year;
  }

  public int getYear(){
    return this.year;
  }

  public void displayDate(){
    System.out.printf("The date is: %d / %d / %d", this.day, this.month, this.year);
  }

}