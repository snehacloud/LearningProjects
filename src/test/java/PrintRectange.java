import java.util.Scanner;

public class PrintRectange {

    public void printRect(int row, int column){

        for(int i=0; i<row; i++){
            if(i == 0 || i==row-1){
                for(int j=0; j<column; j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=0; j<column; j++){
                    if(j == 0 || j==column-1){
                        System.out.print("*");
                     }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }

    public void printReact2DArray(int row,int column){
        String[][] arr = new String[row][column];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                if(i==0 || i==row-1)
                {
                    arr[i][j] = "*";
                } else if (j==0 || j==column-1)
                {
                    arr[i][j] = "*";
                }
            }
        }
        System.out.print(arr);
    }

    public static void main(String arg[]) {
        PrintRectange rect = new PrintRectange();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of row:");
        int row = sc.nextInt();
        System.out.println("Enter value of column:");
        int column = sc.nextInt();
        //rect.printRect(row,column);
        rect.printReact2DArray(row,column);
    }
}
