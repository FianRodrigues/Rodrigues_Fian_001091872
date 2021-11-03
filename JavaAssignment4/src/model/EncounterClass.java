/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author fianrodrigues
 */
public class EncounterClass 
{
    private VitalSignsClass vitalSign;
    private Date encDate;

    public EncounterClass( VitalSignsClass vitalSign,  Date encDate)
    {

        this.vitalSign =vitalSign;
        this.encDate = encDate;

    }

    public Date getEncDate()
    {
        return encDate;
    }

    public void setEncDate(Date encDate)
    {
        this.encDate = encDate;
    }

    public EncounterClass(VitalSignsClass vs, Date resultdate, String text) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public VitalSignsClass getVitalSign() 
    {
        return vitalSign;
    }

    public void setVitalSign(VitalSignsClass vitalSign) 
    {
        this.vitalSign = vitalSign;
    }

    
    void addEncounter(EncounterClass encounter) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
