import java.util.Scanner;
public class LMS1b {
    public static void main (String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the consumed water amount in litres: ");
     int num = sc.nextInt();
     if(num <= 500){
        System.out.print("The bill is Rs 100");
     } else {
        System.out.print("The bill is Rs 200");
     } 
    }


    
}
