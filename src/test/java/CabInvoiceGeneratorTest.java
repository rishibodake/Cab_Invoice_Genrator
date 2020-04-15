import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest
{
    //Test For Calculating Fare
    @Test
    public void givenDistanceAndTime_InvoiceGenerator_shouldReturnTrue()
    {
      InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
      double distance=2.0;
      int time=5;
      double fare = invoiceGenerator.calculateFare(distance,time);
        Assert.assertEquals(25,fare,0.0);
    }
}
