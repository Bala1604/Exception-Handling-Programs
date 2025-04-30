package ExceptionHandlingPrograms.ThrowsKeyword;

public class Throwsexample1 {
    public static void main(String[]args)throws Exception{
        method1();
    }
    public static void method1()throws Exception{
        method2();
    }
    public static void method2()throws Exception{
        method3();
    }
    public static void method3()throws Exception{
        System.out.println(10/0);
    }  
}
