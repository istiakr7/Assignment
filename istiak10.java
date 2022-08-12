import java.util.Scanner;

public class istiak10 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integer number :");

         a = input.nextInt();
         b = input.nextInt();
         c = input.nextInt();

        if (a > b && a > c)
            System.out.println("Largest Number is : " + a);
        else if (b > a && b > c)
            System.out.println("Largest Number is : " + b);
        else
            System.out.println("Largest Number is : " + c);

    }
}
