/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory
{
    ArrayList<Restaurant> restaurants = new ArrayList<>();
    
    public RestaurantDirectory()
    {
        
    }
    
    public Restaurant findRestaurant(String id)
    {
        for (Restaurant rest : restaurants) 
        {
            if (rest.getUsername().equals(id)) 
            {
                return rest;
            }
        }
        return null;
    }

    public void removeRestaurant(String username) 
    {
        for (Restaurant rest : restaurants) 
        {
            if (rest.getUsername().equals(username))
            {
                restaurants.remove(rest);
                return;
            }
        }
    }
    
    public Restaurant loginResaturant(String username, String password) 
    {

        for (Restaurant rest : restaurants) 
        {
            if (rest.getUsername().equals(username) && rest.getPassword().equals(password)) 
            {
                return rest;
            }
        }
        return null;
    }
    
    public void addRestaurant(Restaurant rest) 
    {
        restaurants.add(rest);
    }

    public ArrayList<Restaurant> getRestaurants()
    {
        return restaurants;
    }

    public void setRestaurants(ArrayList<Restaurant> restaurants) 
    {
        this.restaurants = restaurants;
    }

    public Iterable<Restaurant> getRestaurents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Iterable<Restaurant> getRestaurant() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
