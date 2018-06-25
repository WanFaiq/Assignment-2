
public class Action extends DVDs {
	
	public Action (String title, String director, int released, int duration) {
		this.title = title;
		this.director = director;
		this.released = released;
		this.duration = duration;
	}

	
	 public void print (int x) {
	    System.out.println(title + ",Director: " + director + ", Year released:  " + released + ", Duration: " + duration + " minutes");
	}
	
	
	
	
	
}
