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
public class EncounterHistoryClass 
{
    
    ArrayList<EncounterClass> encounterHistory;

    public EncounterHistoryClass()
    {
        encounterHistory = new ArrayList<>();
    }

    public void addEncounter(EncounterClass encounter) 
    {
        encounterHistory.add(encounter);
    }

    public ArrayList<EncounterClass> getEncounterHistory() 
    {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<EncounterClass> encounterHistory)
    {
        this.encounterHistory = encounterHistory;
    }
}
