import java.util.Arrays;

public class O3 {
    public static void main(String[] args) {
//        java does not allows garbage value or unpredictable data

        // Arraycopy method

        int[] source ={2,3,4,5,67,8,213,6,23};
        int[] destination1 = Arrays.copyOfRange(source,0,3);
        System.out.println("Destination 1 = "+Arrays.toString(destination1));

    }
}
