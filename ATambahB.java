import java.util.Scanner;
public class ATambahB {

    public static void main (String [] args){
    Scanner itik = new Scanner(System.in);
    int A,B;
    A = itik.nextInt();
    B = itik.nextInt();
    
    int total;
    total = A + B;
    
    System.out.println(total);
    }
}