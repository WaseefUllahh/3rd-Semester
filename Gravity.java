import java.util.Scanner;
public class Gravity {
    public static void main(String[] args){
 
   System.out.println("This equation will found out the position X(t) of an object at time t and acceleration a at velocity.");
   
   System.out.println("Enter acceleration of the object");        
   Scanner input=new Scanner(System.in);
   float a=input.nextFloat();
   System.out.println("Enter Time elapsed");
   float t=input.nextFloat();
   
   System.out.println("Enter initial Velocity");
   float vi=input.nextFloat();
   
   System.out.println("Enter initial Position");
   float xi=input.nextFloat();
   
   System.out.println("The final position is :");
   double x_t=0.5*a*t*t+vi*t+xi;
   System.out.println("The final position is :"+x_t);
   
   input.close();
    }
}
