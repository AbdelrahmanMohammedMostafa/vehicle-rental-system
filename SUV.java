public class SUV extends Car implements Vehicle {
   private boolean fourWD;
   private int groundClearance;
   public SUV(String make,String model,int year,double price,boolean fourWD,int groundClearance){
       super(make, model, year, price);
       this.fourWD = fourWD;
       this.groundClearance = groundClearance;
   }
public boolean is FourWD() { 
    return fourWD;
 }   
 public int getGroundClearance() { 
    return groundClearance;
 }

public void FourWD(boolean fourWD){
    this.fourWD = fourWD;
}
  
public void setGrondClearance(int groundClearance){
    this.groundClearance = groundClearance;
}

@Override 
public String toString(){
    return "SUV{" +
            "fourWD=" + fourWD +
            ", groundClearance=" + groundClearance +
            "} " + super.toString();
}
public String displayDetails(){
    return "SUV Details:\n" +
           "Make: " + getMake() + "\n" +
           "Model: " + getModel() + "\n" +
           "Year: " + getYear() + "\n" +
           "Price: $" + getPrice() + "\n" +
           "Four Wheel Drive: " + isFourWD() + "\n" +
           "Ground Clearance: " + getGroundClearance() + " inches\n";
}
public String TypeSpecificData(){
    return "Type: SUV\n" +
           "Four Wheel Drive: " + isFourWD() + "\n" +
           "Ground Clearance: " + getGroundClearance() + " inches\n";
}



