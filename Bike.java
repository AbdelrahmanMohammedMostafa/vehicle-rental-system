public class Bike extends Vehicle{
private int engineCapacity;
    private String type;
    public Bike(String brand, int engineCapacity, String type) {
        super(brand);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }
    public int getEngineCapacity() {
        return engineCapacity;
    }
    public String getType() {
        return type;
    }
    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    public void setType(String type) {
        this.type = type;
    }
@Override
public string toSting(){
    return "Bike [brand="+getBrand()+", engineCapacity="+engineCapacity+",type="+type+"]";
}

public String displayDetails(){
    return "Bike[brand="+getBrand()+",engineCapacity="+engineCapacity+",type="+type+"]";
}
}
