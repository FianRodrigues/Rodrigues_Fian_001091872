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
public class CommunityClass 
{
    private String community;
    ArrayList<HouseClass> house;

    public ArrayList<HouseClass> getHouse()
    {
        return house;
    }

    public void setHouse(ArrayList<HouseClass> house)
    {
        this.house = house;
    }
    
    public CommunityClass(String comm)
    {
        community = comm;
    }

    public String getCommunity()
    {
        return community;
    }

    public void setCommunity(String community) 
    {
        this.community = community;
    }
}
