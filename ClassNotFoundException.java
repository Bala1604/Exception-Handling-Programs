package ExceptionHandlingPrograms;

public class ClassNotFoundException {
    public static void main(String[]args){
        try{
           Class.forName("exampleclass");
        }
        catch(Exception e){
            System.out.println("class nor found:"+e.getMessage());
        }
    }
    
}
