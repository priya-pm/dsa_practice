import java.util.InputMismatchException;
import  java.util.Scanner;
public class AverageOfNumbers {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Enter the n number:");
            int n = in.nextInt();
            double sum = 0;
            if(n<=0){
                System.out.println("N cannot be negative and zero.");
            } else if(n > 0) {
                for (int i = 1; i <= n; i++) {
                    System.out.printf("Enter the %d number: %n",i);
                    int input = in.nextInt();
                    sum += input;
                }
                double average = sum /n;
                System.out.printf("Average of %d numbers is %.2f",n,average);
            }

        }catch (InputMismatchException ex){
            System.out.println("Please provide valid integer input");
        }finally {
            in.close();
        }
    }
}
