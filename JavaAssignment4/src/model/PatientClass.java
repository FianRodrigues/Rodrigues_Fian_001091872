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
public class PatientClass extends PersonClass
{
    
    
    private EncounterHistoryClass encounterHistory;

    public PatientClass(String name, HouseClass address, String dob, int id, EncounterClass en)
    {
        super(name, address, dob, id);
        this.encounterHistory = new EncounterHistoryClass();
        this.encounterHistory.addEncounter(en);
    }

    public EncounterHistoryClass getEncounterHistory()
    {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistoryClass eh)
    {
        this.encounterHistory = eh;
    }
    
}
