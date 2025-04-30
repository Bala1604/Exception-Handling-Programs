package ExceptionHandlingPrograms.Unchecked;

public class NullPointerException {
    public static void main(String[] args) {
        try{
            Integer val = null;
            System.out.println(val);
        }
        catch(Exception e){
            System.out.println("nullpointerexception:"+e.getMessage());
        }
    }
    
}
