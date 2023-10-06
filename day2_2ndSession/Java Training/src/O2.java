import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class O2 {
    public static void main(String[] args) {
        // duplicate elements not allowed
        Scanner in = new Scanner(System.in);
        Set<Integer> list = new TreeSet<>();
        while (true)
        {
            System.out.println("Enter 0 to stop");
            int n = in.nextInt();
//            otherwiser use integer.parseInt
            // otherwise take all inputs in form of strings then parse it

            if(n==0)
            {
                break;
            }
            list.add(n);
        }

        System.out.println("Numbers are : ");
        for (Integer i : list)
        {
            System.out.print(i + " ");
        }
    }
}
