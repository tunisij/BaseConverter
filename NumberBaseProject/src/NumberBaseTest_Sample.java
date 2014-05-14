import org.junit.Assert;
import org.junit.Test;

/**
 * Example (but nowhere near complete) unit tests for the NumberBase.conversions method
 *
 * @author Zachary Kurmas
 */
// Created  8/26/13 at 11:48 AM
// (C) Zachary Kurmas 2013

public class NumberBaseTest_Sample {

   @Test
   public void decimal_to_binary() throws Throwable {
      Assert.assertEquals("0", NumberBase.convert("0", 10, 2));
      Assert.assertEquals("1", NumberBase.convert("1", 10, 2));
      Assert.assertEquals("10", NumberBase.convert("2", 10, 2));
      Assert.assertEquals("11", NumberBase.convert("3", 10, 2));
      Assert.assertEquals("1010", NumberBase.convert("10", 10, 2));
      Assert.assertEquals("1000011110001", NumberBase.convert("4337", 10, 2));
   }

   @Test
   public void binary_to_decimal() throws Throwable {
      Assert.assertEquals("0", NumberBase.convert("0", 2, 10));
      Assert.assertEquals("1", NumberBase.convert("1", 2, 10));
      Assert.assertEquals("2", NumberBase.convert("10", 2, 10));
      Assert.assertEquals("3", NumberBase.convert("11", 2, 10));
      Assert.assertEquals("10", NumberBase.convert("1010", 2, 10));
      Assert.assertEquals("4337", NumberBase.convert("1000011110001", 2, 10));
   }

   @Test
   public void decimal_to_hex() throws Throwable {
      Assert.assertEquals("0", NumberBase.convert("0", 10, 16));
      Assert.assertEquals("1", NumberBase.convert("1", 10, 16));
    //  Assert.assertEquals("a", NumberBase.convert("10", 10, 16));
      Assert.assertEquals("64", NumberBase.convert("100", 10, 16));
      Assert.assertEquals("dead", NumberBase.convert("57005", 10, 16));
   }

   // Be sure to test other values and base pairs!
}