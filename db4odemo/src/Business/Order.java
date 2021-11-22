/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author fianrodrigues
 */
public class Order 
{
   private String restaurant;
   private String foodItem;
   private int price;
   private String deliveryMan;
   private String OrderStatus;

    
   public Order(String r, String i, int p, String u)
   {
       restaurant = r;
       foodItem = i;
       price = p;
       deliveryMan = "";
   }

    public String getDeliveryMan() 
    {
        try
        {
            return deliveryMan;
        }
        catch(Exception e)
        {
            deliveryMan = "";
            return deliveryMan;
        }
        
    }

    public void setDeliveryMan(String deliveryMan) 
    {
        this.deliveryMan = deliveryMan;
    }

    public String getOrderStatus() 
    {
        return OrderStatus;
    }

    public void setOrderStatus(String OrderStatus)
    {
        this.OrderStatus = OrderStatus;
    }

    public String getRestaurant()
    {
        return restaurant;
    }

    public void setRestaurant(String restaurant)
    {
        this.restaurant = restaurant;
    }

    public String getFoodItem()
    {
        return foodItem;
    }

    public void setFoodItem(String foodItem) 
    {
        this.foodItem = foodItem;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

   
}
