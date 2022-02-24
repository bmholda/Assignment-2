
import java.util.Scanner;

public class RandomNumberGuesser {
	public static void main(String args[]) {
		int loop = 0;
		do {
			int guessamount = 0;
			int lownum = 0;
			int highnum = 99;
			Scanner scanner = new Scanner(System.in);
			RNG random = new RNG();
			int solution = random.rand();
			System.out.println("Enter your first guess:");
			int userinput = scanner.nextInt();
			guessamount = guessamount + 1;
			System.out.println("Amount of Guesses: " + guessamount);
			if(userinput > solution) {
				System.out.println("Guess was too high");
				highnum = userinput;
			}else {
				System.out.println("Guess was too low");
				lownum = userinput;
			}
			int nested = 0;
			while(nested == 0) {
				if(userinput == solution) {
					System.out.println("Congrats you guessed correctly");
					System.out.println("Would you like to try again?");
					String retry = scanner.next();
					if(retry.equals("yes") || retry.equals("Yes")) {
						break;
					}else {
						System.out.println("Thanks for playing");
						loop = 1;
						break;
					}
				}
				System.out.println("Enter next guess between " + lownum + " and " + highnum);
				userinput = scanner.nextInt();
				boolean bound = random.inputValidation(userinput, lownum, highnum);
				if(bound == true) {
					
				}else {
					userinput = scanner.nextInt();
				}
				guessamount = guessamount + 1;
				System.out.println("Amount of Guesses: " + guessamount);
				if(userinput > solution) {
					System.out.println("Guess was too high");
					highnum = userinput;
					
				}else if(userinput < solution) {
					System.out.println("Guess was too low");
					lownum = userinput;
				}
			}
			
		}while(loop ==0);
	}
}
	