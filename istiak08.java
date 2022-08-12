import java.util.Scanner;
public class istiak08 {
    public static void main(String[] args) {
        int x;

        Scanner store = new Scanner(System.in);
        System.out.println("Enter any number : ");
        x = store.nextInt();

        if(x%2==0)
            System.out.println("This number is Even");
        else
            System.out.println("This number is Odd");

    }
}
