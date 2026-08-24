public abstract class vehicle {
private string vehicleid;
private string model;
private string type;
private string licenseplate;
private int year;
private double rentalPricePerDay;
private string availabilitystatus;
private string fuelType;
private int seatingCapacity;
 public vehicle(string vehicleid, string model, string type, string licenseplate, int year, double rentalpriceperday, string availabilitystatus, string fueltype, int seatingcapacity) {    
this.vehicleid = vehicleid;
this.model = model;
this.type = type;
this.licenseplate = licenseplate;
this.year = year;
this.rentalpriceperday =rentalpriceperday;
this.availabilitystatus = availabilitystatus;
this.fueltype =fueltype;
this.seatingcapacity = seatingcapacity;
}

public string getVehicleId() {
return vehicleid;
}

public string getModel() {
return model;
}

public string getType() {
return type;
}

public string getLicensePlate() {
return licenseplate;
}

public int getYear() {
return year;
}

public double getRentalPricePerDay() {
return rentalpriceperday;
}

public string getAvailabilityStatus() {
return availabilitystatus;
}

public string getFuelType() {
return fueltype;
}

public int getSeatingCapacity() {
return seatingcapacity;
}
public void setAvailabilityStatus(string availabilitystatus) {
this.availabilitystatus = availabilitystatus;
}
public void setRentalPricePerDay(double rentalpriceperday) {
this.rentalpriceperday = rentalpriceperday;
}
public void setModel(string model) {
this.model = model;
} 

public void setType(string type) {
this.type = type;
}
public void setLicensePlate(string licenseplate) {
this.licenseplate = licenseplate;
}
 public void setyear(int year ){
    this.year = year;
 }
public void setFuelType(string fueltype){
    this.fueltype = fueltype;
}
public void setSeatingCapacity(int seatingcapacity){
    this.seatingcapacity = seatingcapacity;
}
public void displayVehicleDetails(){
system.out.println("Vehicle id: " + vehicleid);
system.out.println("Model: " + model);
system.out.println("Type: " + type);
system.out.println("License Plate: " + licenseplate);
system.out.println("Year: " + year);
system.out.println("Rental Price Per Day: " + rentalpriceperday);
system.out.println("Availability Status: " + availabilitystatus);
system.out.println("Fuel Type: " + fueltype);
system.out.println("Seating Capacity: " + seatingcapacity);
}

public void rentVehicle(){
    
if(availabilitystatus.equals("Available")) {
    availabilitystatus = "Rented";
    System.out.println("Vehicle rented successfully.");
} else {
    System.out.println("Vehicle is not available for rent.");
}
}
public void returnVehicle(){
    if(availabilitystatus.equals("Rented")) {
        availabilitystatus = "Available";
        System.out.println("Vehicle returned successfully.");
    } else {
        System.out.println("Vehicle is not currently rented.");
    }
}
public void updateRentalPrice(double newPrice){
    this.rentalpriceperday = newPrice;
}
public void updateVehicleDetails(string model, string type, string licenseplate, int year, string fueltype, int seatingcapacity ){

    this.model = model;
    this.type = type;
    this.licenseplate = licenseplate;
    this.year = year;
    this.fueltype = fueltype;
    this.seatingcapacity = seatingcapacity;
}
public void displayRentalPrice(){
    System.out.println("Current rental price per day: " + rentalpriceperday);
}

public void displayAvailabilityStatus(){
    System.out.println("Availability Status: " + availabilitystatus);
}

public void returnVehicleDetails(){
    System.out.println("Vehicle id: " + vehicleid);
    System.out.println("Model: " + model);
    System.out.println("Type: " + type);
    System.out.println("License Plate: " + licenseplate);
    System.out.println("Year: " + year);
    System.out.println("Rental Price Per Day: " + rentalpriceperday);
    System.out.println("Availability Status: " + availabilitystatus);
    System.out.println("Fuel Type: " + fueltype);
    System.out.println("Seating Capacity: " + seatingcapacity);
}
public void isAvailable(){
 if(availabilitystatus.equals("Available")) {
     System.out.println("Vehicle is available for rent.");
 } else {
     System.out.println("Vehicle is not available for rent.");
 }
}



public void calaulataeRentalCost(int days){
double totalCost = rentalpriceperday * days;
System.out.println("Total rental cost for " + days + " days: $" + totalCost);

}
public void displayDetails( string details){
    System.out.println(details);
}
public void toString(sting details){
    system.out,println(details)
}
 




}
