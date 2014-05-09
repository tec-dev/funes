package model.objects;

import java.util.ArrayList;

public class Category {
	private String name;
	private ArrayList<Object> members;
	
	public Category(String name) {
		this.name = name;
		this.members = new ArrayList<Object>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Object> getMembers() {
		return members;
	}

	public void addMember(Object newMember) {
		if(!members.contains(newMember))
			members.add(newMember);
	}	
	
}
