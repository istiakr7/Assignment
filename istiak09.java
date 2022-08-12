import java.util.Scanner;

public class istiak09 {
    public static void main(String[] args) {

        char zd;
        System.out.println("Enter a character : ");
        Scanner store = new Scanner(System.in);
        zd = store.next().charAt(0);

        if (zd == 'a' || zd == 'e' || zd == 'i' || zd == 'o' || zd == 'u')
            System.out.println("It's a vowel alphabet");
        else if (zd == 'A' || zd == 'E' || zd == 'I' || zd == 'O' || zd == 'U')
            System.out.println("It's a vowel alphabet");
        else
            System.out.println("It's a consonant alphabet");
    }
}
