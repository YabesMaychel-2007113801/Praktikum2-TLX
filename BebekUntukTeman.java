import java.util.Scanner;
public class BebekUntukTeman {
    public static void main (String []args){
    Scanner teman = new Scanner(System.in);
    int N = teman.nextInt();
    int M = teman.nextInt();

    int masing= N/M;
    int sisa = N%M;
    System.out.println("masing-masing " + masing);
    System.out.println("bersisa " + sisa);
    }
}
