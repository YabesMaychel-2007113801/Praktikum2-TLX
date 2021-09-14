import java.util.Scanner;
public class TransposMatriks {
    public static void main (String [] args){
     Scanner matrix = new Scanner(System.in);
     int[][] matriks = new int[3][3];

     for (int k = 0; k<3; k++)
     {
         for (int l = 0; l<3; l++)
         { matriks[k][l] = matrix.nextInt();}
     }

     for (int k = 0; k<3; k++)
     {
        for (int l = 0; l<3; l++)
        {
            System.out.print(matriks[l][k]);
            if (l <= 1){
                System.out.print(" ");
            } else {System.out.print("\n");
        }
        }
     }

    }
    
}