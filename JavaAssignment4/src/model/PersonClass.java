/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author fianrodrigues
 */
public class PersonClass 
{
    private String name;
    private HouseClass address;
    private String dob;
    private int id;

    public PersonClass(String name, HouseClass address, String dob, int id) 
    {

        this.name = name;
        this.address = address;
        this.dob = dob;
        this.id = id;

    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public HouseClass getAddress() 
    {
        return address;
    }

    public void setAddress(HouseClass address)
    {
        this.address = address;
    }

    public String getDOB()
    {
        return dob;
    }

    public void setDOB(String dob)
    {
        this.dob = dob;
    }

    public int getID() 
    {
        return id;
    }

    public void setID(int id)
    {
        this.id = id;
    }
}
