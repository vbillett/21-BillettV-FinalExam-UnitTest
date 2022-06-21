import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

	@Test
	public void negativeException() {
		assertThrows(IllegalArgumentException.class, () -> {
			StringCalculator.add("-1,5");
		});
	}

	@Test
	public void ignoreBig() {
		assertEquals(StringCalculator.add("1,1000"), 1);
	}

}
