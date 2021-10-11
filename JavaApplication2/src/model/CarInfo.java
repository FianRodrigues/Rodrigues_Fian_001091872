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
public class CarInfo 
{
    private String make;
    private String manufactureDate;
    private int seats;
    private Long serialNumber;
    private String modelNumber;
    private String city;
    private String manufactureYear;
    private String certificate;
    private String availability;

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getCertificate()
    {
        return certificate;
    }

    public void setCertificate(String certificate) 
    {
        this.certificate = certificate;
    }

    public String getManufactureYear() 
    {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear)
    {
        this.manufactureYear = manufactureYear;
    }

    public String getCity() 
    {
        return city;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }
    

    public String getMake() 
    {
        return make;
    }

    public void setMake(String make) 
    {
        this.make = make;
    }

    public String getManufactureDate() 
    {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) 
    {
        this.manufactureDate = manufactureDate;
    }

    public int getSeats()
    {
        return seats;
    }

    /**
     *
     * @param seats
     */
    public void setSeats(int seats)
    {
        this.seats = seats;
    }

    public Long getSerialNumber() 
    {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    /**
     *
     * @return
     */
    public String getModelNumber() 
    {
        return modelNumber;
    }

    /**
     *
     * @param modelNumber
     */
    public void setModelNumber(String modelNumber)
    {
        this.modelNumber = modelNumber;
    }
    
    @Override
    public String toString()
    {
        return make;
    }
}
