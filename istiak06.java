import java.util.Scanner;
public class istiak06 {
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integer");

        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Before swap the value of  a = "+a);
        System.out.println("Before swap the value of b = "+b);
        int c = a;
        a = b;
        b = c;
        System.out.println("After swap the value of  a ="+a);
        System.out.println("After swap the value of b ="+b);
    }
}
