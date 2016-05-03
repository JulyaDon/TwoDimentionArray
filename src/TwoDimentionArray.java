/**
 * Created by July on 03.05.2016.
 */
public class TwoDimentionArray {
    public static void main(String[] args) {
        int[][] Array = new int[10][10];
        int i;
        int j;

        //output array
        for(i=0; i<Array.length; i++){
            for(j = 0; j<Array[i].length; j++){
                System.out.print(Array[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
