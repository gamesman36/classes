public class Main {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);

        int dist = 252;

        double gallons = minivan.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles, minivan needs " +
                gallons + " gallons of fuel.");

        gallons = sportscar.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles, sportscar needs " +
                gallons + " gallons of fuel.");

        int minivanRange = minivan.range();
        System.out.println("The range of minivan is " + minivanRange + " miles.");

        int sportscarRange = sportscar.range();
        System.out.println("The range of sportscar is " + sportscarRange + " miles.");

        int minivanPassengers = minivan.getPassengers();
        System.out.println("The number of passengers in minivan is " + minivanPassengers + ".");

        int sportscarFuelCap = sportscar.getFuelCap();
        System.out.println("The fuel capacity of sportscar is " + sportscarFuelCap + " gallons.");
    }
}