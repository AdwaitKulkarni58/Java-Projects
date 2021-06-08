class Sphere{
  double diameter;

Sphere(double diameter) {
  this.diameter = diameter;
}

public void setDiameter(double diameter){
  this.diameter = diameter;
}

public double getDiameter() {
  return diameter;
}

public double getVolume() {
  return 4/3 * Math.PI * (diameter / 2) * (diameter / 2) * (diameter / 2);
}

public double getSurfaceArea() {
  return 4 * Math.PI * (diameter / 2) * (diameter / 2);
  }
}