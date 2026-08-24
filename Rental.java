/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sudan
 */
//Rental: class can manages transactions between customers and vehicles
import java.time.LocalDate;
public class Rental {
    private String RentalID;
    private String CustomerID;
    private String VehicleID;
    private LocalDate RentalDate;
    private LocalDate ReturnDate;
    private LocalDate ActualReturnDate;
    private double TotalCost;
    private String Status;
    
    public Rental(String RentalID, String CustomerID, String VehicleID, LocalDate RentalDate,LocalDate ReturnDate, LocalDate ActualReturnDate,double TotalCost, String Status){
        this.RentalID=RentalID;
        this.CustomerID=CustomerID;
        this.VehicleID=VehicleID;
        this.RentalDate=RentalDate;
        this.ReturnDate=ReturnDate;
        this.ActualReturnDate=ActualReturnDate;
        this.TotalCost=TotalCost;
        this.Status=Status;
    }

    public void setRentalID(String RentalID) {
        this.RentalID = RentalID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public void setVehicleID(String VehicleID) {
        this.VehicleID = VehicleID;
    }

    public void setRentalDate(LocalDate RentalDate) {
        this.RentalDate = RentalDate;
    }

    public void setReturnDate(LocalDate ReturnDate) {
        this.ReturnDate = ReturnDate;
    }

    public void setActualReturnDate(LocalDate ActualReturnDate) {
        this.ActualReturnDate = ActualReturnDate;
    }

    public void setTotalCost(double TotalCost) {
        this.TotalCost = TotalCost;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getRentalID() {
        return RentalID;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public String getVehicleID() {
        return VehicleID;
    }

    public LocalDate getRentalDate() {
        return RentalDate;
    }

    public LocalDate getReturnDate() {
        return ReturnDate;
    }

    public LocalDate getActualReturnDate() {
        return ActualReturnDate;
    }

    public double getTotalCost() {
        return TotalCost;
    }

    public String getStatus() {
        return Status;
    }
    

}
