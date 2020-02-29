import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * 异常处理的方式二： throws + 异常类型
 * 1 "throws"+ 异常类型"   写在方法的声明处， 指明此方法执行时，可能会抛出的异常类型。
 * 一旦当方法体执行时，出现异常，仍会在异常代码处生成一个异常类的对象，此对象满足throws后异常类型时， 就会被抛出！！（throw）
 */

public class ExceptionTest2 {
    public static void main(String[] args)  {

        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void method2() throws IOException {
        System.out.println("找不到这个文件");
        method1();
    }

    public static void method1() throws IOException  {
        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while(data!=-1){
            System.out.println((char)data);
            data = fis.read();
        }
        fis.close();
    }







}
