class Main {
  public static void main(String[] args) {
    RemoteDevice r1 = new DVDPlayer();
    r1.switchOn();
    r1.switchOff();
    RemoteDevice r2 = new TV();
    r2.switchOn();
    r2.switchOff();
  }
}