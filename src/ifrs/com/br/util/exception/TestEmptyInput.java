package ifrs.com.br.util.exception;

public class TestEmptyInput {
	public static void testInput(String input, String message) throws IllegalArgumentException {
		if (input.isEmpty() || input == null) {
			throw new IllegalArgumentException(message);
		}
	}

}
