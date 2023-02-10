import java.util.*;

public class VehicleMain {
    static int n,f,fc,ec,nd;
    static String vm,vn,ft,as;
    static boolean kc;
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
    //    Vehicle v1=new Vehicle();
        FourWheeler v1= new FourWheeler();
        
       
        System.out.println("1.Four Wheeler");
        System.out.println("2.Two Wheeler");
        System.out.println("Enter Vehicle Type:");
        n= sc.nextInt();
         switch(n){
            case 1:
            sc.nextLine();
            System.out.println("Vehicle Make:");
            vm=sc.nextLine();
            v1.setMake(vm);
            System.out.println("Vehicle Number:");
            vn=sc.nextLine();
            v1.setVehicleNumber(vn);
            System.out.println("Fuel Type:");
            System.out.println("1.Petrol");
            System.out.println("2.Diesel");
            f = sc.nextInt();
            if(f==1){
                v1.setFuelType("Petrol");
            }
            else{
                v1.setFuelType("Diesel");
            }
            System.out.println("Fuel Capacity:");
            fc=sc.nextInt();
            v1.setFuelCapacity(fc);
            System.out.println("Engine CC:");
            ec=sc.nextInt();
            v1.setCC(ec);
            sc.nextLine();
            System.out.println("Audio System:");
            as=sc.nextLine();
            v1.setAudioSystem(as);
            System.out.println("Number of Doors:");
            nd=sc.nextInt();
            v1.setNumberOfDoors(nd);

            v1.displayMake();
            v1.displaybasicInfo();
            v1.displayDetailInfo();

            FourWheeler(vm,vn,f,fc,ec,as,nd);
            
            break;

            case 2:
            TwoWheeler v2=new TwoWheeler();
            sc.nextLine();
            System.out.println("Vehicle Make:");
            vm=sc.nextLine();
            v2.setMake(vm);
            System.out.println("Vehicle Number:");
            vn=sc.nextLine();
            v2.setVehicleNumber(vn);
            System.out.println("Fuel Type:");
            System.out.println("1.Petrol");
            System.out.println("2.Diesel");
            f = sc.nextInt();
            if(f==1){
                v2.setFuelType("Petrol");
            }
            else if(f==2){
                v2.setFuelType("Diesel");
            }

            System.out.println("Fuel Capacity:");
            fc=sc.nextInt();
            v2.setFuelCapacity(fc);
            System.out.println("Engine CC:");
            ec=sc.nextInt();
            v2.setCC(ec);
            sc.nextLine();
            System.out.println("Kick Start Available(yes/no):");
            String temp = sc.nextLine();
            if(temp.toLowerCase().equals("yes"))
            {
                 v2.setkickStartAvailable(true);
            }
            else{
            v2.setkickStartAvailable(false);
            }
            v2.displayMake();
            v2.displaybasicInfo();
            v2.displayDetailInfo();

            TwoWheeler tw= TwoWheeler(vm,vn,f,fc,ec,kc);
            
            break;

         }

    
        
            

    
    }
    private static TwoWheeler TwoWheeler(String vm2, String vn2, int f2, int fc2, int ec2, boolean kc2) {
        return null;
    }
    private static void FourWheeler(String vm2, String vn2, int f2, int fc2, int ec2, String as2, int nd2) {
    }
    
}
