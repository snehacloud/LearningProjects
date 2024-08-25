public class ArmstrongNo {
    public static void main(String arg[]){
        int num= 153, r,a=0, n=num;
        while(n>0){
            r = n%10;
            a= a+ r*r*r;
            n=n/10;
        }
        if(num==a){System.out.println("Armstrong Number");}
        else {System.out.println("Not Armstrong Number");}

        //Number of digits in a number
        int  number = 127654329;
        int digit = 0;
        while(number>0){
            if(number%10 !=0){
                digit=digit+1;
            }
            number=number/10;
        }
        System.out.println(digit);

        //Sum of digits
        int sum=0;
        while (num>0){
            r = num%10;
            sum=sum+r;
            num=num/10;
        }
        System.out.println("Sum of digits: "+sum);
    }
}
