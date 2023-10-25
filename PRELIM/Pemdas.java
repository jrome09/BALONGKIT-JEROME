import java.util.Scanner;
 public class Pemdas{
 public static void main (String [] args){
  Scanner in = new Scanner(System.in);
 System.out.print("Input number one : ");
 int num1 = in.nextInt();
 System.out.print("Input number two: ");
 int num2 = in.nextInt();
 int sum = num1 + num2;
 int dif = num1 - num2;
 int prod = num1 * num2;
 int quotient = num1 / num2;
 int mod = num1 % num2;
  System.out.println("Total of sum: " + sum);
  System.out.println("Total of difference: " + dif);
  System.out.println("Total of product: " + prod);
  System.out.println("Total of quotient: " + quotient);
  System.out.println("Total of modulo: " + mod);
 
 }
}