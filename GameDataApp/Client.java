import java.util.HashMap;
import java.util.Scanner;

public class Client {
	
	private HashMap<String, Game> list;
	
	public Client() {
		list = new HashMap<String, Game>();
	}
	
	public void AddGame(String name, String platform, byte pegiRating, String genre) {
		 list.put(name ,new Game(name, platform, pegiRating, genre));
	}
	
	public void AddGameArray(Game[] gamearray) {
		for(Game game : gamearray) {
			list.put(game.getName(), new Game(game.getName(),game.getPlat(),game.getPegi(),game.getGenre()));
		}
	}

	
	public void Remove(String id) {
		list.remove(id);
	}
	
	public void Search() {
		System.out.println("Please enter the name of a game!");
	    Scanner scan = new Scanner(System.in);
	    String gameSearch = scan.nextLine();

		
	    boolean results = false;
	    for(String key : list.keySet()) {
	    	if(list.get(key).getName().contains(gameSearch.toLowerCase())) {
	    		results = true;
	    		list.get(key).Output();
	    	}
	    }
	    if(results == false) {
	    	System.out.println("No Results for " + gameSearch);
	    }
	}
	
	public void Search(String input) {		
		boolean results = false;
	    for(String key : list.keySet()) {
	    	if(list.get(key).getName().contains(input.toLowerCase())) {
	    		results = true;
	    		list.get(key).Output();
	    	}
	    }
	    if(results == false) {
	    	System.out.println("No Results for " + input);
	    }
	}

	public static void main(String[] args) { 
	    Client client = new Client();
	    
	    client.AddGame("Assassins's Creed 2", "XBOX", (byte)15, "Action");
	    client.AddGame("Star wars the force unleashed 2", "XBOX", (byte)16, "Action");
	    client.AddGame("Need for speed", "XBOX", (byte)16, "Racing");
	    client.AddGame("Batman Arkham Orgins", "XBOX", (byte)16, "Action");
	    
	    //client.Remove("Need for speed");
	    
	    client.Search("Need");
	}

}
