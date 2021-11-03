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
public class PatientDirectoryClass 
{
    

    private ArrayList<PatientClass> patients = new ArrayList<>();

    public void addPatients(PatientClass patient) 
    {
        patients.add(patient);
    }

    public ArrayList<PatientClass> getPatients() 
    {
        return patients;
    }

    public void setPatients(ArrayList<PatientClass> patients) 
    {
        this.patients = patients;
    }

    public void encounterPatient(int id, EncounterClass enc)
    {

        for (PatientClass v : patients)
        {

            if (v.getID() == id) 
            {
                v.getEncounterHistory().addEncounter(enc);
                return;
            }
        }
    }

    public void deletePatient(int id)
    {
        for (PatientClass v : patients)
        {

            if (v.getID() == id) 
            {
                patients.remove(v);
                return;
            }
        }
    }

    public PatientClass searcPatient(int txtId) 
    {

        for (PatientClass v : patients)
        {
            if (v.getID() == txtId)
            {
                return v;
            }
        }
        return null;

    }
}