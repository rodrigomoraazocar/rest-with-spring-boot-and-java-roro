package br.com.roro;

public class Greetings {
	
	private final long id;
	private final String content;
	
	
	
	//Constructor
	public Greetings(long id, String content) {
		this.id = id;
		this.content = content;
	}
	
	
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	
	

}
