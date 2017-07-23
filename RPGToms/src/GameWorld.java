import java.util.Scanner;

public class GameWorld {
	private int capacityX;
	private int capacityY;
	Location[][] map;
	private int posX;
	private int posY;
	private String currentPlayerName;
	Location currentPos;
	
	public GameWorld(int x, int y,String playername){
		map = new Location[x][y];
		capacityX = (x-1);
		capacityY = (y-1);
		this.currentPlayerName = playername;
		map[3][4] = new Location();
		map[4][3] = new Location();
		map[4][4] = new Location();
		map[5][4] = new Location();
		map[4][5] = new Location();
		
		setLocation(4,4);
	}
	
	
	public Location getLocation(){
		return currentPos;
	}
	public void setLocation(int x, int y){
		if(x < capacityX && y < capacityY){
			posX = x;
			posY = y;
			
			currentPos = map[x][y];
		}
	}
	
	public void Move(){
		Scanner scan = new Scanner(System.in);
		
		if(map[posX][posY - 1] != null && map[posX][posY - 1].accessBottom != false){
			System.out.print("(0) ");
			RpgGame.GameUtils.AnimateText("North");
			//MoveNorth();
		}else{
			System.out.print("(0) ");
			RpgGame.GameUtils.AnimateText("-----");
		}
		
		if(map[posX + 1][posY] != null && map[posX + 1][posY].accessRight != false){
			//MoveEast();
			System.out.print("(1) ");
			RpgGame.GameUtils.AnimateText("East");
		}else{
			System.out.print("(1) ");
			RpgGame.GameUtils.AnimateText("-----");
		}
		
		if(map[posX][posY + 1] != null && map[posX][posY + 1].accessTop != false){
			//MoveSouth();
			System.out.print("(2) ");
			RpgGame.GameUtils.AnimateText("South");
		}else{
			System.out.print("(2) ");
			RpgGame.GameUtils.AnimateText("-----");
		}
		if(map[posX - 1][posY] != null && map[posX - 1][posY].accessLeft != false){
			//MoveWest();
			System.out.print("(3) ");
			RpgGame.GameUtils.AnimateText("West");
		}else{
			System.out.print("(3) ");
			RpgGame.GameUtils.AnimateText("----");
		}
		
		System.out.print("(-) ");
		RpgGame.GameUtils.AnimateText("Cancel");
		switch(scan.nextLine()){
		case "0":
			if(map[posX][posY - 1] != null){
				MoveNorth();
			}
			break;
		case "1":
			if(map[posX + 1][posY] != null){
				MoveEast();
			}
			break;
		case "2":
			if(map[posX][posY + 1] != null){
				MoveSouth();
			}
			break;
		case "3":
			if(map[posX - 1][posY] != null){
				MoveWest();
			}
			break;
		case "-":
			return;
		default:
			RpgGame.GameUtils.AnimateText("Invaild!");
			Move();
		}
	}
	
	private void MoveNorth(){
		if(map[posX][posY - 1].accessBottom == true){
			posY--;
			currentPos = map[posX][posY - 1];
			
		}
	}
	private void MoveNorthWest(){
		if(map[posX - 1][posY - 1].accessBottomRight == true){
			posX--;
			posY--;
			currentPos = map[posX - 1][posY - 1];
		}
	}
	private void MoveNorthEast(){
		if(map[posX + 1][posY - 1].accessBottomLeft == true){
			posX++;
			posY--;
			currentPos = map[posX + 1][posY - 1];
		}
	}

	private void MoveSouth(){
		if(map[posX][posY + 1].accessTop == true){
			posY++;
			currentPos = map[posX][posY + 1];
		}
	}
	private void MoveSouthWest(){
		if(map[posX - 1][posY + 1].accessTopLeft == true){
			posX--;
			posY++;
			currentPos = map[posX - 1][posY + 1];
		}
	}
	private void MoveSouthEast(){
		if(map[posX + 1][posY + 1].accessTopRight == true){
			posX++;
			posY++;
			currentPos = map[posX + 1][posY + 1];
		}
	}
		
	private void MoveWest(){
		if(map[posX - 1][posY].accessRight == true){
			posX++;
			currentPos = map[posX - 1][posY];
		}
	}
	private void MoveEast(){
		if(map[posX + 1][posY].accessLeft == true){
			posX++;
			currentPos = map[posX + 1][posY];
		}
	}
}
