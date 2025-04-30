package ExceptionHandlingPrograms.Unchecked;

public class ArithmeticException {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; 
        } catch (Exception e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
    }
    
}
