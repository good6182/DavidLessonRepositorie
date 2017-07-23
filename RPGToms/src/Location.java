import java.util.Random;

public class Location {
	protected String id;
	protected int posX;
	protected int posY;
	
	
	protected boolean accessTop;
	protected boolean accessTopLeft;
	protected boolean accessTopRight;
	
	protected boolean accessBottom;
	protected boolean accessBottomLeft;
	protected boolean accessBottomRight;
	
	protected boolean accessLeft;
	protected boolean accessRight;
	
	public Location(){
		Random rand = new Random();
		accessTop = true;
		accessBottom = true;
		accessLeft = true;
		accessRight = false;
	}
	//ID
	public String getId(){
		return id;
	}
	public void setId(String input){
		this.id = input;
	}
	
////Attributes///////////////////////////////////////////////////////////////////////////////////
		
	public int getPosX(){
		return posX;
	}
	public int getPosY(){
		return posY;
	}
	
	public void setPosX(int input){
		this.posX = input;
	}
	
	public void setPosY(int input){
		this.posY = input;
	}
	
	
}
