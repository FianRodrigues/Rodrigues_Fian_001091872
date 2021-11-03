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
public class VitalSignsClass 
{
    
    private int bodyTemp;
    private int pulseRate;
    private int bloodPressure;

    public VitalSignsClass(int bodyTemp, int pulseRate, int bloodPressure) 
    {
        this.bodyTemp = bodyTemp;
        this.pulseRate = pulseRate;
        this.bloodPressure = bloodPressure;
    }

    public int getBodyTemp()
    {
        return bodyTemp;
    }

    public void setBodyTemp(int bodyTemp)
    {
        this.bodyTemp = bodyTemp;
    }

    public int getPulseRate() 
    {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) 
    {
        this.pulseRate = pulseRate;
    }
    
    public int getBloodPressure() 
    {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) 
    {
        this.bloodPressure = bloodPressure;
    }
}
