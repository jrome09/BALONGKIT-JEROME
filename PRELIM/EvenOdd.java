import java.util.Scanner;
public class EvenOdd{
public static void main(String[] a){
Scanner in = new Scanner(System.in);
while(true){
System.out.print("Enter a number: ");
int num = in.nextInt();
if(num % 2 == 0){
System.out.println("You enter even number");
}else{
System.out.println("You enter odd number");
  }
  }
 }
}