public class Vehicle{
    private String make;
    private String vehicleNumber;
    private String fuelType;
    private int fuelCapacity;
    private int cc;

    public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc){
        this.make = make;
        this.vehicleNumber = vehicleNumber;
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.cc = cc;
    }

    public Vehicle() {
    }

    public void setMake(String make){
        this.make=make;
    }
    public void setVehicleNumber(String vehicleNumber){
        this.vehicleNumber=vehicleNumber;
    }
    public void setFuelType(String fuelType){
        this.fuelType=fuelType;
    }
    public void setFuelCapacity(int fuelCapacity){
        this.fuelCapacity=fuelCapacity;
    }
    public void setCC(int cc){
        this.cc=cc;
    }
    
    public String getMake(){ return make;}
    public String getVehicleNumber(){ return vehicleNumber;
    }
    public String getFuelType(){ return fuelType;}
    public int getFuelCapacity(){ return fuelCapacity;}
    public int getCC(){ return cc;}

    public void displayMake(){
        System.out.println("***"+getMake()+"***");
    }
    public void displaybasicInfo(){
        System.out.println("---Basic Information---");
        System.out.println("Vehicle Number:"+getVehicleNumber());
        System.out.println("Fuel Capacity:"+getFuelCapacity());
        System.out.println("Fuel Type:"+getFuelType());
        System.out.println("CC:"+getCC());

    }
    public void displayDetailInfo(){
        
    }

    
    
    

}
