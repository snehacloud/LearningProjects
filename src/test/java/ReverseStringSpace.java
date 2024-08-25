public class ReverseStringSpace {

    public void ReverseString(){

    }

    public static void main(String arg[]){

        String str = "I am a tester";

        char[] arr = str.replace(" ","").toCharArray();

        char[] revArr = new char[arr.length];

        for (int i=0; i<arr.length; i++)

        {

            revArr[arr.length-i-1] = arr[i];

        }

        char[] strArr = str.toCharArray();

        char[] lastArr = new char[strArr.length];

        int j = 0;

        for(int i=0; i<strArr.length; i++){

            if (strArr[i] != ' ') {

                lastArr[i] = revArr[j];

                j++;

            }

            else

            {

                lastArr[i] = strArr[i];

            }

        }

        System.out.println(lastArr);

    }

}