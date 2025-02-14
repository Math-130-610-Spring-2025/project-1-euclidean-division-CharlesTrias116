import java.util.Scanner;

public class EuclideanDivision {
    public static void main (String[] args){
        // Made by Charles Trias
        Scanner Input = new Scanner(System.in);
        System.out.println("Please enter the dividend:");
        int dividend = Input.nextInt();
        System.out.println("Please enter a divisor:");
        int divisor = Input.nextInt();
        int quotient = dividend/divisor;
        int remainder = dividend%divisor;
        System.out.println(dividend + "=" + quotient + "*" + divisor + "+" + remainder);
    }
}
