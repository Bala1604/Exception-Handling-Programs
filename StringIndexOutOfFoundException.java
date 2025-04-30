package ExceptionHandlingPrograms.Unchecked;

public class StringIndexOutOfFoundException {
    public static void main(String[]args){
        try{
            String str="hello";
            char ch=str.charAt(8);
        }
        catch(Exception e){
            System.out.println("Stringindexoutofbound:"+e.getMessage());
        }
    }
    
}
