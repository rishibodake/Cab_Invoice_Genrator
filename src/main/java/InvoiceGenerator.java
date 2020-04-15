public class InvoiceGenerator {

   private static final double COST_PER_KM = 10.00;
   private static final double COST_PER_MINUTE = 1.00;
   private static final double MINIMUM_COST = 5.00;

   public double calculateFare(double distance, int time)
    {
        double totalFare = ((distance * COST_PER_KM) + (time * COST_PER_MINUTE));
        return Math.max(totalFare, MINIMUM_COST);
    }

    public double calculateFare(Ride[] rides) { //Non Primitive data
        double totalFare = 0;
        for (Ride ride:rides)
        {
           totalFare = totalFare + this.calculateFare(ride.distance,ride.time);
        }
        return totalFare;
    }
}
