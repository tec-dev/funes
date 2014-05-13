package model.logic;

import java.util.ArrayList;

import model.objects.*;

public class LoginSystem {
	private ArrayList<User> users;
	private ArrayList<Entity> entities;
	private ArrayList<Person> persons;
	private ArrayList<Category> entityCategories;
	private ArrayList<Category> personCategories;
	
	private PersonCriteria personCriteria;
	private EntityCriteria entityCriteria;
	
	//Static variables
	public static final int NAME = 0;
	public static final int ID = 1;
	public static final int CATEGORY = 2;
	
	public LoginSystem() {	
		users = new ArrayList<User>();
		entities = new ArrayList<Entity>();
		persons = new ArrayList<Person>();
		personCategories = new ArrayList<Category>();
		entityCategories = new ArrayList<Category>();
	}
	
	public User logUserIn(String username, String password) {
		//TODO
		return null;
	}

	public void deleteUser(User user) {
		//TODO
	}
	
	public ArrayList<Person> searchPerson(String key, int searchBy) {
		//TODO
		return null;
	}
	
	public ArrayList<Entity> searchEntity(String key, int searchBy) {
		//TODO
		return null;
	}
	
	private ArrayList<Person> searchPersonByCategory(String key) {
		//TODO
		return null;
	}
	
	private ArrayList<Entity> searchEntityByCategory(String key) {
		//TODO
		return null;
	}

	public ArrayList<User> getUsers() {
		return users;
	}
	
	public void registerUser(User user) {
		//TODO	
	}		

	public ArrayList<Entity> getEntities() {
		return entities;
	}

	public void registerEntity(Entity entity) {
		//TODO
	}
	
	public ArrayList<Person> getPersons() {
		return persons;
	}
	
	public void registerPerson(Person person) {
		//TODO
	}

	public ArrayList<Category> getPersonCategories() {
		return personCategories;
	}
	
	public void addPersonCategory(String categoryName) {
		//TODO
	}
	
	public ArrayList<Category> getEntityCategories() {
		return entityCategories;
	}
	
	public void addEntityCategory(String categoryName) {
		//TODO
	}
	
}
