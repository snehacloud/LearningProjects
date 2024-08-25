import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Practise {
    //Array from 1-10, if even then even will print and if odd then odd will print
    public static void main(String arg[]){
        int[] intArr = new int[]{0,1,2,3,4,5,6,7,8,9,10,25,49,169};
        Map<Integer,String> map = new LinkedHashMap<>();
//        for(int i=0; i<intArr.length; i++){
//            if((intArr[i]%2)== 0){
//                map.put(intArr[i],"even");
//            }
//            else{
//                map.put(intArr[i],"odd");
//            }
//        }
//        System.out.println(map);

        //Prime
        for(int i: intArr){
            if(i==0 || i==1){
                map.put(i,"not prime");
            } else if (i==2) {
                map.put(i,"prime");
            } else {
                for(int j=2; j<i; j++){
                    if(i%j==0){
                        map.put(i,"not prime");
                        break;
                    }
                    else{
                        map.put(i,"prime");
                    }
                }
            }
        }
        for(Map.Entry<Integer,String> num : map.entrySet())
        {
            System.out.println(num.getKey()+" : "+num.getValue());
        }
    }
}
