
public class FourWheeler extends Vehicle{

    private String audioSystem;
    private int numberOfDoors;

    public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem, int numberOfDoors) {
        super(make, vehicleNumber, fuelType, fuelCapacity, cc);
        this.audioSystem=audioSystem;
        this.numberOfDoors=numberOfDoors;
        //TODO Auto-generated constructor stub
    }
    
    public FourWheeler() {
    }

    public void setAudioSystem(String audioSystem){
        this.audioSystem=audioSystem;
    }
    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors=numberOfDoors;
    }
    public String getAudioSystem(){ return audioSystem;
    }
    public int getNumberOfDoors(){ return numberOfDoors;}
    public void displayDetailInfo(){
        System.out.println("---Detail Information---");
        System.out.println("Audio System :"+ getAudioSystem());
        System.out.println("Number of Doors :"+ getNumberOfDoors());

    }

}
