import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class MyTest {
	

	@Test
	public void testToBaseTen() {
	      Assert.assertEquals("0", NumberBase.convert("0000", 2, 10));
	      Assert.assertEquals("1", NumberBase.convert("0001", 2, 10));
	      Assert.assertEquals("2", NumberBase.convert("0010", 2, 10));
	      Assert.assertEquals("3", NumberBase.convert("0011", 2, 10));
	      Assert.assertEquals("4", NumberBase.convert("0100", 2, 10));
	      Assert.assertEquals("5", NumberBase.convert("0101", 2, 10));
	      Assert.assertEquals("6", NumberBase.convert("0110", 2, 10));
	      Assert.assertEquals("7", NumberBase.convert("0111", 2, 10));
          Assert.assertEquals("8", NumberBase.convert("1000", 2, 10));
	      Assert.assertEquals("9", NumberBase.convert("1001", 2, 10));
	      Assert.assertEquals("10", NumberBase.convert("1010", 2, 10));
	      Assert.assertEquals("11", NumberBase.convert("1011", 2, 10));
	      Assert.assertEquals("12", NumberBase.convert("1100", 2, 10));
	      Assert.assertEquals("13", NumberBase.convert("1101", 2, 10));
	      Assert.assertEquals("14", NumberBase.convert("1110", 2, 10));
	      Assert.assertEquals("15", NumberBase.convert("1111", 2, 10));
	      Assert.assertEquals("1", NumberBase.convert("1", 2, 10));
	      Assert.assertEquals("3", NumberBase.convert("11", 2, 10));
	      Assert.assertEquals("2", NumberBase.convert("10", 2, 10));
	      Assert.assertEquals("181", NumberBase.convert("10110101", 2, 10));
	      Assert.assertEquals("1", NumberBase.convert("1", 3, 10));
	      Assert.assertEquals("9", NumberBase.convert("100", 3, 10));
	      Assert.assertEquals("39", NumberBase.convert("124", 5, 10));
	      Assert.assertEquals("100", NumberBase.convert("400", 5, 10));
	      Assert.assertEquals("10", NumberBase.convert("13", 7, 10));
	      Assert.assertEquals("25", NumberBase.convert("27", 9, 10));
	      Assert.assertEquals("34", NumberBase.convert("12", 32, 10));
	      Assert.assertEquals("6", NumberBase.convert("6", 20, 10));
	      Assert.assertEquals("6", NumberBase.convert("6", 10, 10));
	      Assert.assertEquals("110", NumberBase.convert("6", 10, 2));
	      Assert.assertEquals("12G", NumberBase.convert("456", 10, 20));
	      Assert.assertEquals("DE", NumberBase.convert("456", 10, 34));
	      Assert.assertEquals("4337", NumberBase.convert("1000011110001", 2, 10));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_bad_input1() {
	   NumberBase.convert("!", 10, 2);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_bad_input2() {
	   NumberBase.convert("12321", 3, 4);
	}
}
