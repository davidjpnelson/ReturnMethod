class Vehicle {
  int passengers; // number of passengers
  int fuelcap; // fuel capacity in gallons
  int mpg; // fuel consumption in miles per gallon

  int range() {
     return fuelcap * mpg;
  }
}