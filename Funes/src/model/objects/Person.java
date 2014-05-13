package model.objects;

import java.util.ArrayList;
import java.util.Calendar;

public class Person {
	private long id;
	private String name;
	private String lastName;
	private int gender;
	private Calendar birthDate;
	private String company;
	private String jobPosition;
	private double rank;
	private ArrayList<Review> reviews;
	private ArrayList<Complaint> complaints;
	
	public Person(long id) {
		this.id = id;
		reviews = new ArrayList<Review>();
		complaints = new ArrayList<Complaint>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Calendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
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
		if(!reviews.contains(review))
			reviews.add(review);
	}
	
	public void removeReview(Review review) {
		//TODO
	}
	
	public void fileComplaint(Complaint complaint) {
		//TODO
	}

	public ArrayList<Complaint> getComplaints() {
		return complaints;
	}	
	
	public int getAge() {
		//TODO
		return 0;
	}
	
	public boolean equals(Object person) {
		//TODO
		return false;
	}
	
}
