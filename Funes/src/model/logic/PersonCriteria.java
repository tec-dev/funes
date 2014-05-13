package model.logic;

import java.util.ArrayList;

import model.objects.Person;

public interface PersonCriteria {
   public ArrayList<Person> meetCriteria(ArrayList<Person> persons,String key);
}
