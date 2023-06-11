class Vehicle {
    private final int passengers;  // number of passengers
    private final int fuelcap;     // fuel capacity in gallons
    private final int mpg;         // fuel consumption in miles per gallon

    // constructor for Vehicle
    public Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // accessor methods
    public int getPassengers() {
        return passengers;
    }

    public int getFuelCap() {
        return fuelcap;
    }

    // return the range of the vehicle
    public int range() {
        return mpg * fuelcap;
    }

    // compute fuel needed for a given distance
    public double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}