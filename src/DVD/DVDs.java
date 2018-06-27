
public class DVDs {
	
	public String title;
	public String director;
	public String genre;
	public int released;
	public int duration; //movie duration in minutes
	
	public DVDs() {
		title = "";
		director = "";
		genre = "";
		released=0;
		duration=0;
	}
	
	
	
	public DVDs (String title, String director, String genre, int released, int duration) {
	
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.released = released;
		this.duration = duration;
	}
	
	
	
	public String gettitleName() {
		return title;
	}
	public String getdirectorName() {
		return director;
	}
	public String getgenreName() {
		return genre;
	}
	public int getreleased() {
		return released;
	}
	public int getduration() {
		return duration;
	}
}
