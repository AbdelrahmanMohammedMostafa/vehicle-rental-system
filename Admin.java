/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sudan
 */
public class Admin extends User{
    
    public Admin(String ID, String FullName, String Username, String Password, String PhoneNumber, String Email_Address){
        super(ID,FullName,Username,Password,PhoneNumber,Email_Address);
    }
    
    @Override
     public void Display(){
        System.out.println("===========Details==========");
        System.out.println("Name: "+getFullName());
        System.out.println("Manager ID: "+getID());
        System.out.println("Username: "+getUsername());
        System.out.println("Phone Number: "+getPhoneNumber());
        System.out.println("Email Address: "+getEmail_Address());        
    }
}
