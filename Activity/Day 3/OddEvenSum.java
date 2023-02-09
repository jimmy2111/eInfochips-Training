import java.util.*;

public class OddEvenSum{
    
    public static void main(String[] ar){
        int esum=0 , osum=0;
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Invalid array size");
            return;
        }
        int[] numbers = new int[n];
        for(int i=0; i<n; i++){
            numbers[i]=sc.nextInt();
            if(numbers[i]<0){
                System.out.println("Invalid Input");
                return;
            }
        }
        for(int i=0; i<n; i++){
            if(numbers[i]%2==0){
                esum=esum+numbers[i];
            }
            else{
                osum=osum+numbers[i];
            }
        }
        System.out.println(Math.max(esum,osum));
    }
}