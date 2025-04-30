package ExceptionHandlingPrograms.Unchecked;

public class ClassCastException {
    public static void main(String[]args){
        try{
            String val="hello world";
            String str=(String)val;
        }
        catch(Exception e){
            System.out.println("Class cast exception: "+e.getMessage());
        }        
    }
    
}
