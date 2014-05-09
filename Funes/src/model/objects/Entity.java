package model.objects;

import java.util.ArrayList;

public class Entity {
	private String name;
	private Category category;
	private String taxId;
	private Address address;
	private double rank;
	
	private ArrayList<Review> reviews;
	private ArrayList<Complaint> complaints;
	
	public Entity(String name) {
		this.name = name;
		reviews = new ArrayList<Review>();
		complaints = new ArrayList<Complaint>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public double getRank() {
		return rank;
	}

	public void setRank(double rank) {
		this.rank = rank;
	}	
	
	public ArrayList<Review> getReviews() {
		return reviews;
	}
	
	public void addReview(Review review) {
		//TODO
	}

	public ArrayList<Complaint> getComplaints() {
		return complaints;
	}
	
	public void fileComplaint(Complaint complaint) {
		//TODO
	}

	public boolean equals(Object person) {
		//TODO
		return false;
	}
}
