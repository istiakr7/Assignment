import java.util.Scanner;
public class istiak12 {
    public static void main(String[]arg){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the integer");
        int x;
        x = input.nextInt();
        if(((x%4==0) && (x%100!=0)) ||(x%400==0) )
        {
            System.out.println( x+" is a leap year");

        }
        else {
            System.out.println( x+" is not a leap year");
        }
    }
}
