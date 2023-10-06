import java.util.Scanner;

public class O1 {

    public static void main(String[] args) throws PanNotValidException {
        //
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Pan");
        String pan = in.nextLine();
        String panExpression = "^[A-Z]{5}[0-9]{3}[A-Z]{1}$";
        try{
            if (pan.matches(panExpression))
            {
                System.out.println("Pan is valid");
            }
            else
                throw new PanNotValidException("Pan is  Invalid");
        }
        catch (PanNotValidException e){
            System.out.println(e.getMessage());
        }

    }
    // code termination abnormally is not possible here
}
