import java.util.Scanner;
public class istiak14 {
    public static void main(String[]arg){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch;
        ch = input.next().charAt(0);
        if(((ch>='a') && (ch<='z')) || ((ch>='A') && (ch<='Z'))){
            System.out.println(ch+ " is an Alphabet");
        }
        else
        {
            System.out.println(ch+ "  is not an Alphabet");
        }

    }


}
