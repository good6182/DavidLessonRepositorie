
public class Game {
	private String name;
	private String platform;
	private byte pegiRating;
	private String genre;
	
	public Game(String name, String platform, byte pegiRating, String genre) {
		this.name = name;
		this.platform = platform;
		this.pegiRating = pegiRating;
		this.genre = genre;
	}
	
	public String getNameLower() {
		return name.toLowerCase();
	}
	
	public String getName() {
		return name;
	}
	
	public String getPlat() {
		return platform;
	}
	
	public byte getPegi() {
		return pegiRating;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void Output() {
		System.out.println(name + " " + pegiRating + " " + genre + " " + platform);
	}
	
	public void OutputRating() {
		System.out.println(name + " " + pegiRating);
	}
	
	public void OutputGenre() {
		System.out.println(name + " " + genre);
	}
}
