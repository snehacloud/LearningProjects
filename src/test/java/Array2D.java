public class Array2D {
    public static void main(String arg[]){
        int[][] testArray = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(testArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
