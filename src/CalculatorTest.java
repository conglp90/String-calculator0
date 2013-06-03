import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testNull() {
		assertTrue(new Calculator().add(null)==0);
	}

	@Test
	public void testBlankValue() {
		assertTrue(new Calculator().add("")==0);
	}
	
	@Test
	public void testOnekValue() {
		assertTrue(new Calculator().add("1")==1);
		assertTrue(new Calculator().add("100")==100);
	}
	
	@Test
	public void testUnknownNumberOfValue() {
		assertTrue(new Calculator().add("1,2,3,4")==10);
	}
	
	@Test
	public void testWithNewLine() {
		assertTrue(new Calculator().add("1\n2,3,4")==10);
	}
	
	@Test
	public void testWithChangeDelimiter() {
		assertTrue(new Calculator().add("//[;]\n1\n2;3,4")==10);
	}
}
