import java.util.Scanner;
public class MyFirstProgram
{
 public static void main(String[] args)
 {
   Scanner sc = new.Scanner(System.in);
   System.out.println(“Enter your choice: A/a, C/c, D/d ”);
   char ch = sc.next().charAt(0);
   ch = ch.toLowerCase(ch);
   switch(ch){
     case a:
       System.out.println("Action movie fan ");
       break;
     case c:
       System.out.println("Comedy Film fan ");
       break;
     case d:
       System.out.println("Drama Movie Fan ");
       break;
     default:
       System.out.println("Invalid option ";
   }
   sc.close()
 }
}
