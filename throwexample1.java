package ExceptionHandlingPrograms.ThrowKeyword;

public class example1 {
    public static void fun() {
        try {
            throw new Exception("This is a custom exception message.");
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
    public static void main(String[]args){
        try{
            fun();
        } catch (Exception e) {
            System.out.println("Caught an exception in main: " + e.getMessage());
        }
        
    }
    
}
