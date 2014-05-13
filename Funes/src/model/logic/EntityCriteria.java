package model.logic;

import java.util.ArrayList;

import model.objects.Entity;

public interface EntityCriteria {
   public ArrayList<Entity> meetCriteria(ArrayList<Entity> entities,String key);
}
