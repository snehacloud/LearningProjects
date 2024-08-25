import java.util.ArrayList;
import java.util.List;

public class Practise3 {
    //Reverse string
    public String ReverseString(String str){
        String strr = new String(str);
        String nstr = "";
        for(int i=0; i<strr.length(); i++){
            nstr = strr.charAt(i)+nstr;
        }
        return nstr;
    }

    public List<Integer> PrimeNumber(int num){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<=num; i++){
            if(i!=0 && i!=1){
                if(i==2){
                    list.add(i);
                }
                else{
                    int j=2;
                    while(j<i){
                        if(i%j==0){
                            break;
                        }
                        j++;
                    }
                    if(i==j){list.add(i);}
                }
            }
        }
        return list;
    }
    public int ListLength(List list){
        int len= list.size();
        return len;
    }

    //ReversePyramid
    public void ReversePyramid(){

    }

    public static void main(String arg[]) {
        Practise3 a = new Practise3();
        System.out.println(a.ReverseString("sneha"));
        System.out.println(a.PrimeNumber(100));
        System.out.println(a.ListLength(a.PrimeNumber(100)));
    }
}
