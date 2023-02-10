
    public class TwoWheeler extends Vehicle{

        private boolean kickStartAvailable;


        public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, boolean kickStartAvailable) {
            super(make, vehicleNumber, fuelType, fuelCapacity, cc);
            this.kickStartAvailable=kickStartAvailable;
            //TODO Auto-generated constructor stub
        }
        public TwoWheeler() {
        }

        public TwoWheeler(String vm, String vn, int f, int fc, int ec, boolean kc) {
        }
        public void setkickStartAvailable(boolean kickStartAvailable){
            this.kickStartAvailable=kickStartAvailable;
        }
        
        public Boolean getkickStartAvailable(){
            return kickStartAvailable;
        }

        public void displayDetailInfo(){
            System.out.println("---Detail Information---");
            if(getkickStartAvailable()==true)
            System.out.println("Kick Start Available:YES");
            else{
                System.out.println("Kick Start Available:NO");
            }
        }
}



