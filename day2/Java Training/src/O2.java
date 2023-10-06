import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {

        // Take a String from user and show only consonants from it
        // input - Dibakar12
        // o/p Dbkr

        // if the vowels are not present and we show

        Scanner in = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = in.nextLine();

        char a[] = word.toCharArray();
//        converting to character array
        String cons = "bcdfghjkmnpqrstvwxyz";

        for(char c:a)
        {
            // indexof - basically character is present in the array or not we are checking
            //
            if(cons.indexOf(c)!=-1)
            {
                System.out.print(c);
            }
        }
    }
}
