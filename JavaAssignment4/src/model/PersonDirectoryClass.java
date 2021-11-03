/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author fianrodrigues
 */
public class PersonDirectoryClass
{
    
    ArrayList<PersonClass> persons;

    public PersonDirectoryClass()
    {
        persons = new ArrayList<>();
    }

    public void addPerson(PersonClass person)
    {
        persons.add(person);
    }
    
    
    public void removePerson(PersonClass person)
    {
        persons.add(person);
    }


    public ArrayList<PersonClass> getPersons() 
    {
        return persons;
    }

    public void setPersons(ArrayList<PersonClass> persons)
    {
        this.persons = persons;
    }

    public PersonClass searchUser(int txtId)
    {

        for (PersonClass v : persons)
        {
            System.out.println("Person :  "+v.getID());
            if (v.getID() == txtId ) 
            {
                System.out.println("Person : "+v.getName());
                return v;
            }
        }
        return null;
    }

    public void deletePerson(int id) 
    {
        System.out.println("ID : "+id);
        
       for (PersonClass p : persons) 
       {
            
            if (p.getID() == id ) 
            {
                persons.remove(p);
                return;
            }
        }
    }
    
}
