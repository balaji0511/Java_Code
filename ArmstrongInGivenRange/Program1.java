package ArmstrongInGivenRange;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int low=in.nextInt();
        int high=in.nextInt();
        for (int num=low;num<=high;num++){
             int sum=0,digit,len,temp;
             len=getOrder(num);
             temp=num;
             while(temp!=0){
                 digit=temp%10;
                 sum+=Math.pow(digit,len);
                 temp/=10;
             }
             if(sum==num){
                 System.out.print(num+" ");
             }
        }
    }
    static int getOrder(int x){
        int len=0;
        while(x!=0){
            len++;
            x/=10;
        }
        return len;
    }
}
