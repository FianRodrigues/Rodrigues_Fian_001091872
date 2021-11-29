/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;


import Business.Customer.Address;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author harold
 */
public class Restaurant extends UserAccount 
{

    private String name;
    private Address address;
    private ArrayList<Menu> menu = new ArrayList<>();
    private HashMap<String, Integer> hash = new HashMap<>();

    public HashMap<String, Integer> getHash()
    {
        try
        {
            return hash;
        }
        catch (Exception e)
        {
            hash = new HashMap<>();
            return hash;
        
        }
        
    }

    public void setHm(HashMap<String, Integer> hash) 
    {
        this.hash = hash;
    }
    
    public void addHM(String k, int v)
    {
        try
        {
            hash.put(k, v);
        }
        catch (Exception e)
        {
            hash = new HashMap<>();
            hash.put(k, v);
        
        }
        
    }
    
    public Restaurant(String username, String password, Role role, int phoneNumber, String foodAllergies, String n, Address a)
    {
        //super(username, password, role, phoneNumber, foodAllergies);
        this.name = n;
        this.address = a;
     

    }
    
    public void addMenu(Menu m)
    {
        try
        {
            menu.add(m);
        }
        catch (Exception e)
        {
            menu = new ArrayList<>();
            menu.add(m);
        }
        
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public ArrayList<Menu> getMenu()
    {
        return menu;
    }

    public void setMenu(ArrayList<Menu> menu)
    {
        this.menu = menu;
    }

    public void removeHM(String key)
    {
        hash.remove(key);
    }

}
