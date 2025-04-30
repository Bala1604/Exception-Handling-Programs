package ExceptionHandlingPrograms;

import java.io.BufferedReader;
import java.io.FileReader;

public class IOException {
    public static void main(String[]args){
        try{
            FileReader file=new FileReader("example.txt");
            BufferedReader reader=new BufferedReader(file);
            String line=reader.readLine();
            reader.close();
        }
        catch(Exception e){
            System.out.println("file not found:"+e.getMessage());
        }
    }
    
}
