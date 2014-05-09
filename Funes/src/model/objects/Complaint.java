package model.objects;

import java.util.ArrayList;

public class Complaint {
	private int rank;
	private String description;
	private Person accuser;
	private Object subject;
	private Category category;
	private ArrayList<Resource> evidence;
	
	public Complaint(int rank, String description, Category category) {
		this.rank = rank;
		this.description = description;
		this.category = category;
		evidence = new ArrayList<Resource>();
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Person getAccuser() {
		return accuser;
	}

	public void setAccuser(Person accuser) {
		this.accuser = accuser;
	}

	public Object getSubject() {
		return subject;
	}

	public void setSubject(Object subject) {
		this.subject = subject;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public ArrayList<Resource> getEvidence() {
		return evidence;
	}

	public void setEvidence(ArrayList<Resource> evidence) {
		this.evidence = evidence;
	}
	
	public void addEvidenceItem(Resource item) {
		if(!evidence.contains(item)) 
			evidence.add(item);
	}
	
	public void removeEvidenceItem() {
		//TODO
	}
}
