/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sudan
 */
//Customer: user who can rent,browse,and cancel bookings
public class Customer extends User {
    private int Age;
    private String Gender;
    private String LicenseNumber;
    
    public Customer(String ID, String FullName, String Username, String Password, String PhoneNumber, String Email_Address,int Age, String Gender, String LicenseNumber){
        super(ID, FullName,Username, Password, PhoneNumber, Email_Address);
       setAge(Age);
       this.Gender=Gender;
       setLicenseNumber(LicenseNumber);
    }

    public void setAge(int Age) {
        if(Age<18){
            throw new IllegalArgumentException("Customer should be at least 18 years old");
        }
        this.Age=Age;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setLicenseNumber(String LicenseNumber) {
        if(LicenseNumber==null){
             throw new IllegalArgumentException("Driving license is Empty!!");
        }
        this.LicenseNumber = LicenseNumber;
    }

    public int getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }

    public String getLicenseNumber() {
        return LicenseNumber;
    }
    @Override
    public void Display(){
        System.out.println("===========Details==========");
        System.out.println("Name: "+getFullName());
        System.out.println("Customer ID: "+getID());
        System.out.println("Username: "+getUsername());
        System.out.println("Phone Number: "+getPhoneNumber());
        System.out.println("Email Address: "+getEmail_Address());
        System.out.println("Age: "+getAge());
        System.out.println("Gender: "+getGender());
        System.out.println("License Number: "+getLicenseNumber());
        
    }    
    
}
