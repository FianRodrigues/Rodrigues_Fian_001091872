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
public class CarDetailHistory
{
    private ArrayList<CarInfo> history;
    
    public CarDetailHistory()
            {
                this.history = new ArrayList<CarInfo>();
            }
    
    public ArrayList<CarInfo> getHistory()
    {
        return history;
    }

    public void setHistory(ArrayList<CarInfo> history) 
    {
        this.history = history;
    }
    
    public CarInfo addNewInfo()
    {
        CarInfo newInfo = new CarInfo();
        history.add(newInfo);
        return newInfo;
    }
    
    public void deleteCar(CarInfo ci)
    {
        history.remove(ci);
    }
}
