import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int userChoice;
		do {
			System.out.println("Options:");
			System.out.println("1. Arrays");
			System.out.println("2. Nested loop");
			System.out.println("3. Operators");
			System.out.println("4.Repatition");
			System.out.println("5. Selection");
			System.out.println("6. Subprograms");
			System.out.println("7. Variables");
			System.out.println("8. Quit");
			userChoice = in.nextInt();

			if (userChoice == 1) {
				System.out.println("You have chosen Array");
				ArraysStuff.Run();
			}
			if (userChoice == 2) {
				System.out.println("You have chosen a nested loop");
			}
			if (userChoice == 3) {
				System.out.println("You have chosen operators");
			}
			if (userChoice == 4) {
				System.out.println("You have chosen Repatition");
			}
			if (userChoice == 5) {
				System.out.println("You have chosen Selection");
			}
			if (userChoice == 6) {
				System.out.println("You have chosen Subprograms");
			}
			if (userChoice == 7) {
				System.out.println("You have chosen Variables");
			}

		} while (userChoice != 8);
		System.out.println("Bye!");
		in.close();

	}

}
