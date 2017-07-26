import java.util.Scanner;

public class PlayerCharacter {
	private String PlayerName;
	private char PlayerGender;
	private int PlayerAge;
	private String PlayerBirthMonth;
	private String PlayerClass;
	
	private int PlayerLevel;
	private int PlayerExpToNext;
	private int PlayerExp;
	
	private int PlayerMaxHealthPoints;
	private int PlayerHealthPoints;
	
	private int PlayerDefencePoints;
	
	public PlayerCharacter(){
		
		MakeName();
		MakeGender();
		MakeAge();
		MakeBirthMonth();
		boolean success;
		do{
			success = ValidateGeneration();
		}while(success == false);
	
		

	}

////Generation of PCharacter////	
	private void MakeName(){
		Scanner scan = new Scanner(System.in);
		RpgGame.GameUtils.AnimateText("What is your name?" ,125);
		this.PlayerName = scan.nextLine();
	}
	
	private void MakeGender(){
		Scanner scan = new Scanner(System.in);
		RpgGame.GameUtils.AnimateText("What is your Gender?" ,125);
		System.out.print("(0) ");
		RpgGame.GameUtils.AnimateText("MALE", 125);
		System.out.print("(1) ");
		RpgGame.GameUtils.AnimateText("FEMALE", 125);
		
		switch(scan.nextLine()){
		case "0":
			PlayerGender = 'M';
			break;
		case "1":
			PlayerGender = 'F';
			break;
			
		default:
			RpgGame.GameUtils.AnimateText("Invalid!", 125);
			MakeGender();
			break;
		}
	}
	
	private void MakeAge(){
		Scanner scan = new Scanner(System.in);
		RpgGame.GameUtils.AnimateText("What is your Age?" ,125);
		try{
		PlayerAge = scan.nextInt();
		}
		catch(Exception e){
			RpgGame.GameUtils.AnimateText("Invalid!",125);
			MakeAge();
		}
	}
	
	private void MakeBirthMonth(){
		Scanner scan = new Scanner(System.in);
		RpgGame.GameUtils.AnimateText("What is your BithMonth?" ,125);
		ReferInformation referinfo = new ReferInformation();
		int count = 0;
		for(String element : referinfo.getMonthsArray()){
			count++;
			System.out.print("(" + count + ") ");
			RpgGame.GameUtils.AnimateText(element ,50);
		}
		
		switch(scan.next()){
		case "1":
			PlayerBirthMonth = referinfo.getMonth(1);
			break;
		case "2":
			PlayerBirthMonth = referinfo.getMonth(2);
			break;
		case "3":
			PlayerBirthMonth = referinfo.getMonth(3);
			break;
		case "4":
			PlayerBirthMonth = referinfo.getMonth(4);
			break;
		case "5":
			PlayerBirthMonth = referinfo.getMonth(5);
			break;
		case "6":
			PlayerBirthMonth = referinfo.getMonth(6);
			break;
		case "7":
			PlayerBirthMonth = referinfo.getMonth(7);
			break;
		case "8":
			PlayerBirthMonth = referinfo.getMonth(8);
			break;
		case "9":
			PlayerBirthMonth = referinfo.getMonth(9);
			break;
		case "10":
			PlayerBirthMonth = referinfo.getMonth(10);
			break;
		case "11":
			PlayerBirthMonth = referinfo.getMonth(11);
			break;
		case "12":
			PlayerBirthMonth = referinfo.getMonth(12);
			break;
			
		default:
			RpgGame.GameUtils.AnimateText("Invalid!", 125);
			MakeBirthMonth();
			break;
		}
	}

////Checking correct Data
	private boolean ValidateGeneration(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Name: " + PlayerName);
		System.out.println("Gender: " + PlayerGender);
		System.out.println("Age: " + PlayerAge);
		System.out.println("Birth Month: " + PlayerBirthMonth);
		System.out.println();
		
		RpgGame.GameUtils.AnimateText("Is this character ready?", 125);
		System.out.print("(0) ");
		RpgGame.GameUtils.AnimateText("Yes", 125);
		System.out.print("(1) ");
		RpgGame.GameUtils.AnimateText("No", 125);
		
		return CheckCharacter(scan.next());
		
	}
	
	private Boolean CheckCharacter(String input){
		
		Scanner scan = new Scanner(System.in);
		switch(input){
		
		case "0":
			return true;
			
		case "1":
			RpgGame.GameUtils.AnimateText("What would you like to change?", 125);
			System.out.print("(0) ");
			RpgGame.GameUtils.AnimateText("Name", 125);
			
			System.out.print("(1) ");
			RpgGame.GameUtils.AnimateText("Gender", 125);
			
			System.out.print("(2) ");
			RpgGame.GameUtils.AnimateText("Age", 125);
			
			System.out.print("(3) ");
			RpgGame.GameUtils.AnimateText("Birth Month", 125);
			
			switch(scan.next()){
			case "0":
				MakeName();
				return false;
			
			case "1":
				MakeGender();
				return false;
				
			case "2":
				MakeAge();
				return false;
				
			case "3":
				MakeBirthMonth();
				return false;
				
			default:
				return ValidateGeneration();
			}
		}
		return true;
	}
	
	
////Getter and Setters
	public String getPlayerName(){
		return PlayerName;
	}
}
