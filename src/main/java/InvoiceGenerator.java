public class InvoiceGenerator {

   private static final double COST_PER_KM = 10.00;
   private static final double COST_PER_MINUTE = 1.00;

   public double calculateFare(double distance, int time)
    {
        double totalFare = ((distance * COST_PER_KM) + (time * COST_PER_MINUTE));
        return totalFare;
    }
}
