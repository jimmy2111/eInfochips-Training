import java.util.*;
public class SumOddDigits{
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 0 || num > 32767){
            System.out.println("Invalid Input");
        }
        else{
            int sum=0;
            while(num!=0){
                int n = num%10;
                if((n%2)!=0){
                    sum = sum+n;
                }
                num=num/10;
            }
            System.out.println(sum);
        }
    }
}