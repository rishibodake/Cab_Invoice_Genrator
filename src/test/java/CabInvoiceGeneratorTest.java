import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest
{
    InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

    //Test For Calculating Fare
    @Test
    public void givenDistanceAndTime_InvoiceGenerator_shouldReturnTotalFare()
    {
      double distance=2.0;
      int time=5;
      double fare = invoiceGenerator.calculateFare(distance,time);
      Assert.assertEquals(25,fare,0.0);
    }

    //Test For Calculating Minimum Distance
    @Test
    public void givenDistanceAndTime_invoiceGenretaor_shouldReturnMinimumFare()
    {
        double distance=0.1;
        int time=1;
        double fare = invoiceGenerator.calculateFare(distance,time);
        Assert.assertEquals(5,fare,0.00);
    }

    //Test For Return Enhanced Invoice Summary
    @Test
    public void givenMultipleRides_shouldReturnInvoiceSummary()
    {
        Ride[] rides = { new Ride(2.0,5),
                       new Ride(0.1,1)};
        InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2,30.00);
        Assert.assertEquals(expectedInvoiceSummary,summary);

    }

}
