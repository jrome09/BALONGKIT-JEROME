import java.util.Scanner;
public class DecisionMakingAct{
 public static void main(String[] a){
 Scanner in = new Scanner(System.in);
 System.out.println("------Route to MoalBoal\n------");
 System.out.println("The Recommended Route:");
 System.out.println(">Mingla     >San Fernando");
 System.out.println(">Carcar     >Barili");
 System.out.println(">Dumanjug   >Alcantara");
 System.out.println(">MoalBoal\n");
 System.out.print("Is Route to Barili (Route 4.1)obtructed? (yes =1 or no = 0): ");
 int isRouteObstructe = in.nextInt();
  if(isRouteObstructe == 0){
   System.out.print("Proceed to Default Route");
    System.out.println("The Recommended Route:");
    System.out.println(">Mingla     >San Fernando");
    System.out.println(">Carcar     >Barili");
    System.out.println(">Dumanjug   >Alcantara");
    System.out.println(">MoalBoal\n");
   }else{
    System.out.println("Sibonga(4.2))");
     System.out.println("Is Route Simbong to Dumanjug (Route 4.2.1)obtructed? (yes =1 or no = 0): ");
   int isRouteObstructed = in.nextInt();
    if(isRouteObstructed == 0){
    System.out.println("Dumanhug(4.2))");
    System.out.println("alCANTARA(4.2)");
    System.out.println(">Mingla     >San Fernando");
 System.out.println(">Carcar     >Barili");
 System.out.println(">Dumanjug   >Alcantara");
   }else{
   System.out.println(">Mingla     >San Fernando");
 System.out.println(">Carcar     >Barili");
 System.out.println(">Dumanjug   >Alcantara");
     System.out.println("Argao(5))");
    System.out.println("Ronda(4.1))");
    System.out.println("alcanta(4.2)");
  }
  }
  }
  }