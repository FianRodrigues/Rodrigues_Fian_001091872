/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory
{

    private ArrayList<DeliveryMan> deliveryMan = new ArrayList<>();
    
    public DeliveryManDirectory()
    {
        deliveryMan = new ArrayList<>();
    
    }

    public void addDeliveryMan(DeliveryMan deliveryMan)
    {
        try
        {
            deliveryMan.add(deliveryMan);
        }
        catch(Exception e)
        {
            deliveryMan = new ArrayList<>();
            deliveryMan.add(deliveryMan);
        }
    }

    public ArrayList<DeliveryMan> getDeliveryMans()
    {
        return deliveryMan;
    }

    public void setDeliveryMans(ArrayList<DeliveryMan> deliveryMans) 
    {
        this.deliveryMan = deliveryMans;
    }

    
    public void removeDeliveryMan(String id) 
    {
        for (DeliveryMan v : deliveryMan)
        {
            if (v.getUsername().equals(id))
            {
                deliveryMan.remove(v);
                break;
            }
        }
    }
    
     public DeliveryMan loginDeliveryMan(String username, String password)
     {
         for (DeliveryMan deliveryMan : deliveryMan) 
         {
            if (deliveryMan.getUsername().equals(username) && deliveryMan.getPassword().equals(password)) 
            {
                return deliveryMan;
            }
        }
        return null;
    }
}
