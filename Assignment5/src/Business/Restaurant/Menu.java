/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author fianrodrigues
 */
public class Menu 
{
     private String foodItem;
     private int amount;

    public String getFoodItem()
    {
        return foodItem;
    }

    public void setFoodItem(String foodItem) 
    {
        this.foodItem = foodItem;
    }
     
    
    public Menu(String foodItem, int amount)
    {
        this.foodItem = foodItem;
        this.amount = amount;
    }

    public int getAmount() 
    {
        return amount;
    }

    public void setAmount(int amount) 
    {
        this.amount = amount;
    }
    
}
