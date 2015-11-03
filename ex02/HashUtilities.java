public class HashUtilities {

	public static int shortHash(int number) {
		int hash = Math.abs(number%1000);
		return hash;
	}
}