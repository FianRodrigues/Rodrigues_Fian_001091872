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
public class CalculateClass 
{
    
    public String community;
    public int[] key;

    public CalculateClass(String comm, int ii) 
    {
        community = comm;
        key = new int[4];
        for (int i = 0; i < 4; i++)
        {
            if (ii == i) 
            {
                key[i] = 1;
            } 
            else
            {
                key[i] = 0;
            }
        }
    }

    public String getCommunity() 
    {
        return community;
    }

    public void setCommunity(String Community) 
    {
        this.community = Community;
    }

    public CalculateClass() 
    {
        key = new int[4];
        for (int i = 0; i < 4; i++) 
        {
            key[i] = 0;
        }
    }

    public void addAgeAnalytics(int i, int count)
    {
        key[i] = count;
    }

    public int getAgeCount(int i) 
    {
        return key[i];
    }
}
