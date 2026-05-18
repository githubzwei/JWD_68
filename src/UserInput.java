import java.io.IOException;

public class UserInput {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter character : ");
		int letter = System.in.read();
		System.out.println("letter : "+letter);
		System.out.println("letter : "+(char)letter);
	}
}
