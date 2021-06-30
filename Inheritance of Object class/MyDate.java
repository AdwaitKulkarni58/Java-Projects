public class MyDate{
  int day;
  int month;
  int year;

  //default constructor
  MyDate(){
    day = 0;
    month = 0;
    year = 0;
  }

  //parametrized constructor
  MyDate(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public boolean equals(Object obj){
    MyDate d = (MyDate)obj;
    if (day == d.day && month == d.month && year == d.year){
      return true;
    }
    else{
      return false;
    }
  }
}