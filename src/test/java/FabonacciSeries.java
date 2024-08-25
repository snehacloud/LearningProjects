import java.util.Scanner;

public class FabonacciSeries {
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();
        int first=0, second=1, next;
        for(int i=0; i<n; i++){
         System.out.print(first +" ");
         next=first;
         first=second;
         second= next+first;
        }
    }
}
