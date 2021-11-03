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
public class SystemClass 
{
    
    private PatientDirectoryClass listOfPatients;
    private PersonDirectoryClass listOfPersons;
    private CityClass city;
    
    public SystemClass()
    {
        listOfPersons = new PersonDirectoryClass();
        listOfPatients  = new PatientDirectoryClass();
    }
    
    
    
    public void addPerson(PersonClass p)
    {
        listOfPersons.addPerson(p);
    }

    public void addPatient(PatientClass p)
    {
        listOfPatients.addPatients(p);
    }
    
    
    
    public CityClass getCity()
    {
        return city;
    }

    public void setCity(CityClass city)
    {
        this.city = city;
    }

    public PatientDirectoryClass getListOfPatients()
    {
        return listOfPatients;
    }

    public void setListOfPatients(PatientDirectoryClass listOfPatients) 
    {
        this.listOfPatients = listOfPatients;
    }

    public PersonDirectoryClass getListOfPersons()
    {
        return listOfPersons;
    }

    public void setListOfPersons(PersonDirectoryClass personList)
    {
        this.listOfPersons = personList;
    }

    public PersonClass searchUser(int txtId) 
    {
        System.out.println("idid:"+txtId);
        return listOfPersons.searchUser(txtId);
    }

    public void encounterPatient(int id, EncounterClass enc) 
    {
        listOfPatients.encounterPatient(id, enc);
    }

    public void deletePerson(int id)
    {
        listOfPersons.deletePerson(id);
    }

    public void deletePatient(int id)
    {
        listOfPatients.deletePatient(id);
    }
    
      public PatientClass searcPatient(int txtId)
    {
        return listOfPatients.searcPatient(txtId);
    }

}
