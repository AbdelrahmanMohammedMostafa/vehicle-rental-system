public class Car extends Vehicle {
    private String transmissionType;
    private int numberOfDoors;
    private boolean hasAirConditioning;
    public void setTransmissionType(String transmissionType){
        this.transmissionType = transmissionType;
    }
    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }
    public void setHasAirConditioning(boolean hasAirConditioning){
        this.hasAirConditioning = hasAirConditioning;
    }

public boolean isHasAirConditioning(){
    return hasAirConditioning;
}

public String getTransmissionType(){
    return transmissionType;
}
public int getNumberOfDoors(){
    return numberOfDoors;
}



@Override 
public String toString(){
    system.out.println("car details:" + "transmission type:"+ transmissionType + "number of doors:"+ numberofdoores+"has air conditioning:"+ hasAirConditioning};
    return "car details:" + "transmission type:"+ transmissionType + "number of doors:"+ numberofdoores+"has air conditioning:"+ hasAirConditioning;+
}


public String getTypeSpecificData(){
    return "Type: Car\n" +
           "Transmission Type: " + getTransmissionType() + "\n" +
           "Number of Doors: " + getNumberOfDoors() + "\n" +
           "Has Air Conditioning: " + isHasAirConditioning() + "\n";
}
public String displayDetails(){
    return super.displayDetails()+getTypeSpecificData();
}
