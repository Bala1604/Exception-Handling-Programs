package ExceptionHandlingPrograms.Multiplecatchblock;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]); 

            String str = null;
            System.out.println(str.length()); 

            int res=10/0;
            System.out.println(res);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException |ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }    
}
