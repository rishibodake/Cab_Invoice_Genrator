import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceServiceTest
{
    InvoiceService invoiceService = new InvoiceService();

    //Test For Calculating Fare
    @Test
    public void givenDistanceAndTime_InvoiceGenerator_shouldReturnTotalFare()
    {
      double distance=2.0;
      int time=5;
      double fare = invoiceService.addRides(distance,time);
      Assert.assertEquals(25,fare,0.0);
    }

    //Test For Calculating Minimum Distance
    @Test
    public void givenDistanceAndTime_invoiceGenretaor_shouldReturnMinimumFare()
    {
        double distance=0.1;
        int time=1;
        double fare = invoiceService.addRides(distance,time);
        Assert.assertEquals(5,fare,0.00);
    }

    //Test For Return Enhanced Invoice Summary
    @Test
    public void givenMultipleRides_shouldReturnInvoiceSummary()
    {
        Ride[] rides = { new Ride(2.0,5),
                       new Ride(0.1,1)};
        InvoiceSummary summary = invoiceService.addRides(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2,30.00);
        Assert.assertEquals(expectedInvoiceSummary,summary);

    }

    //Test For Return Invoice Summary after giving UserId
    @Test
    public void givenUserIdAndRides_shouldReturnInvoiceSummary()
    {
        String userId = "abc@xyz.com";
        Ride[] rides = { new Ride(2.0,5),
                new Ride(0.1,1)};
        invoiceService.addRides(userId,rides);
        InvoiceSummary summary = invoiceService.getInvoiceSummary(userId);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2,30.00);
        Assert.assertEquals(expectedInvoiceSummary,summary); 

    }

}
