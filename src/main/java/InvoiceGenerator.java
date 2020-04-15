public class InvoiceGenerator {

    public double calculateFare(double distance, int time)
    {
        double COST_PER_KM = 10.00;
        double COST_PER_MINUTE = 1.00;
        return ((distance * COST_PER_KM) + (time * COST_PER_MINUTE));
    }
}
