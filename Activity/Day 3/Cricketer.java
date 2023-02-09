import java.util.*;
public class Cricketer {
    public static void main(String[] ar) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Invalid array size");
            return;
        }
        int[] cric=new int[n];
        for(int i=0;i<n;i++){
            cric[i]=sc.nextInt();
            if(cric[i]<0){
                System.out.println("Invalid Input");
                return;
            }
            
        }
        int score = sc.nextInt();
        if(score<0){
            System.out.println("Invalid score");
            return;
        }
        for(int i=0;i<n;i=i+2){
            if(cric[i+1]>score){
                System.out.println(cric[i]);
            }
        }
    }
}


