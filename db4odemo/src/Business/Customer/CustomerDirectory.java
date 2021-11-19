/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory
{

    ArrayList<Customer> customerList = new ArrayList<>();

    public CustomerDirectory()
    {

    }

    public void addCustomer(Customer customer) 
    {
        customerList.add(customer);
    }

    public ArrayList<Customer> getCustomerList() 
    {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList)
    {
        this.customerList = customerList;
    }

    public void removeCustomer(String id)
    {
        for (Customer remCus : customerList)
        {

            if (remCus.getUsername().equals(id))
            {
                customerList.remove(remCus);
                break;
            }
        }
    }

    public Customer loginCustomer(String username, String password) 
    {
        for (Customer logCus : customerList) 
        {
            if (logCus.getUsername().equals(username) && logCus.getPassword().equals(password))
            {
                return logCus;
            }
        }
        return null;
    }
    
}
