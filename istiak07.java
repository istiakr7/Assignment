import java.util.Scanner;
public class istiak07 {
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integer");

        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Before swap the value of a = "+a);
        System.out.println("Before swap the value of b = "+b);
        a = a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swap the value of  a ="+a);
        System.out.println("After Sawp the value of  b ="+b);
    }
}
