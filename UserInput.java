
import java.util.Scanner;

public class UserInput{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);

		System.out.print("Enter your username: ");

		String username = myObj.nextLine();

		System.out.println("welcome " + username); 
	}
}
