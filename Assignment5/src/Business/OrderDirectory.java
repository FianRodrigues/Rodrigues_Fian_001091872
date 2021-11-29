/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author fianrodrigues
 */
public class OrderDirectory
{
     ArrayList<Order> orderList = new ArrayList<>();
    
    public OrderDirectory()
    {
        
    }

    public void addOrder(Order order)
    {
        orderList.add(order); 
    }
    
    public ArrayList<Order> getOrderList() 
    {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) 
    {
        this.orderList = orderList;
    }
    
    
}
