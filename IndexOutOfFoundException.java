package ExceptionHandlingPrograms.Unchecked;

public class IndexOutOfFoundException {
    public static void main(String[]args){
        try{
            int[]arr={1,2,3,4,5,6};
            System.out.println(arr[7]);
        }
        catch(Exception e){
            System.out.println("Index out of bounds exception: "+e.getMessage());
        }
    }
    
}
