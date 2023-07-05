package Armstrong;

public class Program1{
    public static void main(String[] args) {
        int num=153;
        int len;
        len=order(num);
        if(armstrong(num,len)){
            System.out.println(num+" is a armstrong");
        }
        else{
            System.out.println(num+" is not a armstrong");
        }
    }
    static int order(int num){
        int len=0;
        while(num!=0){
            len+=1;
            num/=10;
        }
        return len;
    }
    static boolean armstrong(int num,int len){
        int digit,temp,sum=0;
        temp=num;
        while(temp!=0){
            digit=temp%10;
            sum+=(int)Math.pow(digit,len);
            temp/=10;
        }
        return sum==num;
    }
}
