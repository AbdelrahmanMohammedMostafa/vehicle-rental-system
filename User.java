/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sudan
 */
//User:abstract base class to share personal info for all subclasses
public abstract class User {
    private String ID;
    private String FullName;
    private String Username;
    private String Password;
    private String PhoneNumber;
    private String Email_Address;
    
    public User(){
    }
    
    public User(String ID, String FullName, String Username, String Password, String PhoneNumber, String Email_Address){
        this.ID=ID;
        this.FullName=FullName;
        this.Username=Username;
        this.Password=Password;
        this.PhoneNumber=PhoneNumber;
        this.Email_Address=Email_Address;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setEmail_Address(String Email_Address) {
        this.Email_Address = Email_Address;
    }

    public String getID() {
        return ID;
    }

    public String getFullName(){
        return FullName;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmail_Address() {
        return Email_Address;
    }
    
    public abstract void Display() ;
}
