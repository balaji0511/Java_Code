package Armstrong;

public class Program2 {
    public static void main(String[] args) {
        int num=407;
        int len=order(num);
        if(num==getArmstrong(num,len)){
            System.out.println(num+" is armstrong");
        }
        else{
            System.out.println(num+" is not armstrong");
        }
    }
    static int order(int x){
        int len=0;
        while(x!=0){
            len++;
            x/=10;
        }
        return len;
    }
    static int getArmstrong(int num,int len){
        int temp,digit;
        if(num==0){
            return 0;
        }
        digit=num%10;
        return (int)Math.pow(digit,len) + getArmstrong(num/10,len);
    }
}
