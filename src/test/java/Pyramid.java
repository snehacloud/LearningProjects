class Pyramid{

    public static void main (String[] args){

        int n=3,i,j;

        //Reverse Pyramid
        for(i=n; i>0; i--) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Pyramid
    }
}
