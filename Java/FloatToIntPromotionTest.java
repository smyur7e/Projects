class FloatToIntPromotionTest {
	public static void main(String[] args) {
		int i = (int) 1.1f; // this will NOT compile without a cast
		float f = i; // this will compile

		System.out.println("1.1f CASTED to int = " + i);
		System.out.print("..however i as float = " + f);
	}
}