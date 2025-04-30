package ExceptionHandlingPrograms.ThrowKeyword;

public class throwarthimetic {
    public static void main(String[]args){
        try{
            int a=10;
            int b=0;
            if(b == 0){
                throw new ArithmeticException("Arithmetic Exception: Division by zero is not allowed.");
            }
        } catch(ArithmeticException e){
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }    
}
