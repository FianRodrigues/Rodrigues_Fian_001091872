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
public class CityClass
{
    private String cityName;
    ArrayList<CommunityClass> comm;

    public ArrayList<CommunityClass> getComm() 
    {
        return comm;
    }

    public void setComm(ArrayList<CommunityClass> comm) 
    {
        this.comm = comm;
    }
    
    public CityClass(String city)
    {
        cityName = city;
    }

    public String getCityName() 
    {
        return cityName;
    }

    public void setCityName(String cityName) 
    {
        this.cityName = cityName;
    }
}
