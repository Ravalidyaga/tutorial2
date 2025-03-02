/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here

package com.example.dinemaster.repository;

import java.util.ArrayList;
import com.example.dinemaster.model.Chef;
import com.example.dinemaster.model.Restaurant;

public interface ChefRepository {
    ArrayList<Chef> getChefs();
    Chef getChefById(int id);
    Chef addChef(Chef chef);
    Chef updateChef(int id, Chef chef);
    void deleteChef(int id);
    Restaurant getChefRestaurant(int id);


}
