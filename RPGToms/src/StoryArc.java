import java.io.IOException;
import java.util.Scanner;


 class StoryArc {
	private PlayerCharacter playercharacter;
	private GameWorld gameworld;
	public StoryArc(){
		RpgGame.GameUtils.AnimateText("<----Tom's Game---->");
	}
	
	public void Play(){
		RpgGame.GameUtils.AnimateText("You wake up...");
		RpgGame.GameUtils.AnimateText("The Castle guard asks you to identify yourself.");
		
		System.out.println();
		
		RpgGame.GameUtils.AnimateText("Time to create you!");
		playercharacter = new PlayerCharacter();
		
		
	}
	
	public void Quit(){
		RpgGame.GameUtils.AnimateText("Ending Game Session");
		System.exit(0);
	}
	
	public void DisplayStartMenu(){

		System.out.println();
		
		System.out.print("(0) ");
		RpgGame.GameUtils.AnimateText("Play!");
		System.out.print("(1) ");
		RpgGame.GameUtils.AnimateText("Quit");
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
	
	public void CreateTheGameWorld(){
		gameworld = new GameWorld(10,10,this.getPlayerCharacter());
	}
	
	public void DisplayGamePlayMenu(){
		System.out.print("(0) ");
		RpgGame.GameUtils.AnimateText("Move");
		System.out.print("(1) ");
		RpgGame.GameUtils.AnimateText("Explore");
		
		Scanner scan = new Scanner(System.in);
		switch(scan.next()){
		case "0":
			gameworld.Move();
			break;
			
		default:
			break;
		}
		
		
	}
}
