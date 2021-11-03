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
public class HouseClass 
{
    
    private String address;
    private CommunityClass community;
    private CityClass city;
    
    public HouseClass(String add, CommunityClass community, CityClass city)
    {
        this.address = add;
        this.city = city;
        this.community = community;
        System.out.println("The Address is" + this.address + " , " + this.community + " , " + this.city );
    }

    public HouseClass(String string, String string0, String string1, CommunityClass communityClass, CityClass cityClass, Integer valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public CommunityClass getCommunity() 
    {
        return community;
    }

    public void setCommunity(CommunityClass community)
    {
        this.community = community;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }


    public CityClass getCity() 
    {
        return city;
    }

    public void setCity(CityClass city)
    {
        this.city = city;
    }    
}
