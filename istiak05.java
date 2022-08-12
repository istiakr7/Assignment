import java.util.Scanner;
public class istiak05 {
    public static void main(String[] args) {
        Scanner store = new Scanner(System.in);
        int a,b;

        System.out.println("Enter two numbers : ");
        a = store.nextInt();
        b = store.nextInt();

        System.out.println("Quotient = "+(a/b));
        System.out.println("Remainder = "+(a%b));

    }
}
