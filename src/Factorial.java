import java.util.InputMismatchException;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the input number:");
        try {
            long number = in.nextLong();
            long factorial=1;
            if(number==0){
                System.out.println("Factorial of the input = "+factorial);
            }
            else if(number>0){
                for(int i=1;i<=number;i++){
                    factorial*=i;
                }
                System.out.printf("Factorial of the %d is %d %n",number, factorial);
            } else{
                System.out.println("Input cannot be negative");
            }
        }catch (InputMismatchException ex){
            System.out.println("Please give valid integer input");
        }finally {
            in.close();
        }
    }
}
