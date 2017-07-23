import java.io.IOException;
import java.util.Scanner;



public class StoryArc {
	private PlayerCharacter playercharacter;
	public StoryArc(){
		RpgGame.GameUtils.AnimateText("<----Tom's Game---->", 125);
	}
	
	public void Play(){
		RpgGame.GameUtils.AnimateText("You wake up...",125);
		RpgGame.GameUtils.AnimateText("The Castle guard asks you to identify yourself.",125);
		
		System.out.println();
		
		RpgGame.GameUtils.AnimateText("Time to create you!", 125);
		PlayerCharacter playercharacter = new PlayerCharacter();
		
		
	}
	
	public void Quit(){
		RpgGame.GameUtils.AnimateText("Ending Game Session", 125);
		System.exit(0);
	}
	
	public void DisplayStartMenu(){

		System.out.println();
		
		System.out.print("(0) ");
		RpgGame.GameUtils.AnimateText("Play!", 125);
		System.out.print("(1) ");
		RpgGame.GameUtils.AnimateText("Quit", 125);
		Scanner scan = new Scanner(System.in);
		
		String input = scan.next();
		
		switch(input){
		case "0":
			Play();
			break;
		case "1":
			Quit();
			break;
		default:
			DisplayStartMenu();
			break;
		}
		
	}
	
	public PlayerCharacter getPlayerCharacter(){
		return playercharacter;
	}
}
