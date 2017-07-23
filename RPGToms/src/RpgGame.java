
public class RpgGame {

	public static class GameUtils {
		public static void AnimateText(String text){
			char[] textani = text.toCharArray();
			for(char element : textani){
				System.out.print(element);
				try {
					Thread.sleep(125);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println();			
		}
		
		public static void AnimateText(String text, int input){
			char[] textani = text.toCharArray();
			for(char element : textani){
				System.out.print(element);
				try {
					Thread.sleep(input);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println();	
		}

		public static void Delay(int input){
			try{
				Thread.sleep(input);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StoryArc storyarc = new StoryArc();
		storyarc.DisplayStartMenu();
		storyarc.getPlayerCharacter();
		GameWorld gameworld = new GameWorld(10,10,storyarc.getPlayerCharacter().getPlayerName());
		gameworld.Move();
		
	}

}
