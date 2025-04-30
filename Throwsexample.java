package ExceptionHandlingPrograms.ThrowsKeyword;

public class Throwsexample {
    public static void main(String[] args) throws Exception{
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println("Thread was interrupted: " + e.getMessage());
        }   
    }
}
