/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.UserAccount.UserAccount;
import Business.Role.Role;

/**
 *
 * @author harold
 */
public class DeliveryMan extends UserAccount
{
    
    private String name;
    private String accountNum;

    public DeliveryMan(String username, String password, Role role, String contactNo, String n, String accountNum) 
    {
        super(username, password, role, contactNo);
        this.name = n;
        this.accountNum = accountNum;
    }
     
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAccountNum()
    {
        return accountNum;
    }

    public void setAccountNum(String accountNum)
    {
        this.accountNum = accountNum;
    }
}
