import org.junit.*;
import static org.junit.Assert.*;

public class CalcTest {
	@Test
	public void returnZeroForEmptyString() {
		assertEquals(0,Calc.add(""));
	}
	
	@Test
	public void returnTheNumberItselfIfOnlyOneNumberIsThere() {
		assertEquals(1,Calc.add("1"));
	}
	
	@Test
	public void returnSumOfTwoNumberDeliminatedByComma() {
		assertEquals(3,Calc.add("1,2"));
	}
	
	@Test
	public void returnSumOfMultipleNumberDeliminatedByComma() {
		assertEquals(15,Calc.add("1,2,4,3,5"));
	}
	
	@Test
	public void acceptNewLineAsADeliminator() {
		assertEquals(15,Calc.add("1,2\n4,3,5"));
	}
}
