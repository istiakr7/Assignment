import java.util.Scanner;
public class istiak13{
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer Number");
        int n;
        n = input.nextInt();

        if(n!=0) {
            if (n > 0) {
                System.out.println(n+" is positive number ");
            } else if (n < 0) {
                System.out.println( n+" is negative number ");
            }
            else
            {
                System.out.println("This number is Zero");
            }
        }
    }
}
