public class Practise11 {
    public static void main(String[] args) {
        int a=63,b=76;
        String[] arr = new String[2];
        arr[0] = Integer.toString(a);
        arr[1] = Integer.toString(b);
        char ch = 0;
        for(int i=0; i<arr.length-1; i++){
            char[] ch1 = arr[i].toCharArray();
            char[] ch2 =arr[i+1].toCharArray();
            for(int j=0; j<arr[i].length();j++){
                if(ch1[i]==ch2[j]){
                    ch =ch1[i];
                }
            }
        }
        System.out.println(ch);
    }
}