import java.util.Scanner;
public class LuasSegitiga {
    public static void main (String [] args){
     Scanner luas = new Scanner(System.in);
     double A = luas.nextDouble();
     double T = luas.nextDouble();
     double Segitiga = A*T/2; 
     System.out.printf("%.2f" , Segitiga);



    }
    
}
