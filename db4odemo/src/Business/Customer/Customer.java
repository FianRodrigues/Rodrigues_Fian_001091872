/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Role.Role;
import Business.UserAccount.UserAccount;
import sun.jvm.hotspot.debugger.Address;

/**
 *
 * @author harold
 */
public class Customer extends UserAccount
   {
    
    private String name;
    private Address address;
    
    public Customer(String username, String password, Role role, String contactNo, String name, Address address)
    {
        
        super(username, password, role, contactNo);
        this.name = name;
        this.address = address;
    }
    

    public String getName() 
    {
        return name;
    }

    public void setName(String Name)
    {
        this.name = Name;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }
    
    
}
