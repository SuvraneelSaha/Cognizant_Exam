import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        // collections list
        // hast set
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
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
