package powerWithRecursive;
import java.util.Scanner;
public class powerWithRecursive{


        

        static int exp(int base, int power){

            if(base==1||power==0){
                return 1;
            }
            
            return base*exp(base, power-1);
        }

        public static void main(String[] args) {

            Scanner input=new Scanner(System.in);
            System.out.println("What's the base number: ");
            int x=input.nextInt();
            System.out.println("What's power of the base number: ");
            int y=input.nextInt();
            System.out.println(exp(x, y));
            
            
        }

    
}



