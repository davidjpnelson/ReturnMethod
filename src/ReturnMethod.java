// A program that uses the Vehicle Class

class ReturnMethod{
  public static void main(String[] args) {
    Vehicle coupe = new Vehicle(); // create a Vehicle object named coupe
    Vehicle minivan = new Vehicle(); //create a Vehicle object named minivan
    int rangeC;
    int rangeM;

    //assign values to fields in coupe
    coupe.passengers = 2;
    coupe.fuelcap = 14;
    coupe.mpg = 35;
    rangeC = coupe.range();

    //assign values to fields in minivan
    minivan.passengers = 7;
    minivan.fuelcap = 18;
    minivan.mpg = 21;
    rangeM = minivan.range();

    // state the passenger amount and compute the range of a minivan assuming a full tank of gas
    System.out.print("A coupe carries " + coupe.passengers + " passengers. The range is "
        +  rangeC + ". ");

    // state the passenger amount and compute the range of a minivan assuming a full tank of gas
    System.out.print("A minivan carries " + minivan.passengers + " passengers. The range is "
        + rangeM + ". ");
  }
}