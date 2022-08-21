import java.io.*;

class KeyboardCharReader {

	public static void main(String[] args) throws IOException {

		System.out.println("Press <ENTER> to process input text");

		char key = (char)System.in.read();
		System.out.println("You typed: '" + key + "'");
	}
}