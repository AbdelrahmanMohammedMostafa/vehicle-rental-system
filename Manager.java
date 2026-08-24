/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sudan
 */
//Manager: subclass manages rentals and processes vehicle returns
public class Manager extends User {
    private String Department;
    
    public Manager(String ID, String FullName, String Username, String Password, String PhoneNumber, String Email_Address,String Department){
        super(ID,FullName,Username,Password,PhoneNumber,Email_Address);
        this.Department=Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getDepartment() {
        return Department;
    }
    @Override
    public void Display(){
        System.out.println("===========Details==========");
        System.out.println("Name: "+getFullName());
        System.out.println("Manager ID: "+getID());
        System.out.println("Username: "+getUsername());
        System.out.println("Phone Number: "+getPhoneNumber());
        System.out.println("Email Address: "+getEmail_Address());
        System.out.println("Department: "+getDepartment());
        
    }
}
