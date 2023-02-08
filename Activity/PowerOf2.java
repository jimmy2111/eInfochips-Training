import java.util.*;

public class PowerOf2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n<0){
            System.out.println("Number too small");
            return;
        }
        else if(n>32767){
            System.out.println("Number too large");
        }
        else{
            while((n%2)==0){
                n=n/2;
            }
            if(n==1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}