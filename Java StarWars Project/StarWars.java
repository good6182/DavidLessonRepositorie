import java.util.*;

public class StarWars{

public static void main(String[] args) {
		
		System.out.println("Star Wars");
		
		System.out.println("Write your name here:");
		Scanner scan = new Scanner(System.in);
		
		String name = scan.nextLine();
		
	    System.out.println("Hello "+name);
		
		System.out.println("This is a galexy far far away");
		
		int gameState = 1;
		while(gameState == 1) {
			System.out.println("choose your side sith or jedi");
			System.out.println("choose wisely?");
			System.out.print("(1) "); System.out.println("Jedi!");
			System.out.print("(2) "); System.out.println("Sith!");

			int option = scan.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("you are a Jedi friends with the rebellion");
				gameState = 2;
				break;
			case 2:
				System.out.println("your are with the dark side and are Darth vaders apprentice");
				gameState = 3;
				break;
				
			default:
				System.out.println("You entered an illegal input!");
				break;
				
			}
		}
		//While gameState == 2
			//Jedi route
		
		//While gameState == 3
			//Sith route
		scan.close();
	}
}
