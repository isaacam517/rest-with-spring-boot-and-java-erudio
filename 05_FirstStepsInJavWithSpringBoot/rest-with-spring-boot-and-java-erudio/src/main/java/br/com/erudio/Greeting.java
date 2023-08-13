package br.com.erudio;

public class Greeting {
	
	private final long id;
	private final String content;
	
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}
//
//	public Greeting(long incrementAndGet, String format) {
//		// TODO Auto-generated constructor stub
//	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
	
	
	
	

}
