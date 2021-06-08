class Main {
  public static void main(String[] args) {
    Sphere s1 = new Sphere(2.1);
    Sphere s2 = new Sphere(3.4);
    Sphere s3 = new Sphere(4.5);

    System.out.println("Diameter: " + s1.getDiameter());
    System.out.println("Volume: " + s1.getVolume());
    System.out.println("Surface Area: " + s1.getSurfaceArea());
   
    System.out.println();

    System.out.println("Diameter: " + s2.getDiameter());
    System.out.println("Volume: " + s2.getVolume());
    System.out.println("Surface Area: " + s2.getSurfaceArea());

    System.out.println();

    System.out.println("Diameter: " + s3.getDiameter());
    System.out.println("Volume: " + s3.getVolume());
    System.out.println("Surface Area: " + s3.getSurfaceArea());
  }
}