package model.objects;

import java.util.Calendar;

public class Review { 
	private String text;
	private int rank;
	private Calendar creationDate;
	private Person author;
	private Object subject;
	
	public Review(String text, int rank) {
		this.text = text;
		this.rank = rank;
		this.creationDate = Calendar.getInstance();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	public Object getSubject() {
		return subject;
	}

	public void setSubject(Object subject) {
		this.subject = subject;
	}

	public Calendar getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Calendar creationDate) {
		this.creationDate = creationDate;
	}	
}
